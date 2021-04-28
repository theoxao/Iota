package com.theoxao.iota.trigger.shell

import com.theoxao.iota.base.model.ScriptModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.future.future
import org.springframework.core.ParameterNameDiscoverer
import org.springframework.shell.CommandNotFound
import org.springframework.shell.Input
import org.springframework.shell.Shell
import java.lang.reflect.Method
import java.util.stream.Collectors
import kotlin.system.exitProcess

/**
 * @author theo
 * @date 19-8-15
 */

class IotaShell(private val resultHandler: FutureResultHandler<Any>) : Shell(resultHandler) {

    private val scriptMap =
        mutableMapOf<String, suspend (parameter: suspend (Method, ParameterNameDiscoverer) -> Array<*>?) -> Any?>()

    private val hashMap = mutableMapOf<Int, String>()

    init {
        scriptMap["list"] = {
            "\n" +
                    scriptMap.keys.joinToString("\n")
        }
        scriptMap["quit"] = {
            exitProcess(0)
        }
    }

    suspend fun register(
        scriptModel: ScriptModel,
        invoke: suspend (parameter: suspend (Method, ParameterNameDiscoverer) -> Array<*>?) -> Any?
    ) {
        val uri = scriptModel.scriptSource.url.path.removePrefix(scriptModel.loader.basePath ?: "")
        this.scriptMap[uri] = invoke
        this.hashMap[scriptModel.scriptSource.hash] = uri
    }

    override fun evaluate(input: Input): Any {
        if (noInput(input)) {
            return NO_INPUT
        }
        val words = input.words()
        val line = input.words().stream().collect(Collectors.joining(" ")).trim { it <= ' ' }
        val command = findLongestCommand(line) ?: ""
        if (scriptMap.containsKey(command)) {
            return GlobalScope.future {
                return@future scriptMap[command]?.invoke { method, discoverer ->
                    val names = discoverer.getParameterNames(method)
                    return@invoke words.wordsForArguments(command).resolveArgs(names)
                }
            }
        }
        return CommandNotFound(words)
    }

    private fun List<String>.resolveArgs(names: Array<String>?): Array<Any?> {
        names ?: return arrayOf()
        val words = mapWords(this)
        val result = arrayOfNulls<Any?>(names.size)
        names.forEachIndexed { index, name ->
            val match = words.firstOrNull { it.name == name }
            match?.let {
                words.remove(match)
                result[index] = it.value
            }
        }
        var ix = 0
        result.forEachIndexed { index, value ->
            if (value == null && words.size > ix) {
                result[index] = words[ix].value
                ix++
            }
        }
        return result
    }

    private fun mapWords(words: List<String>): ArrayList<Word> {
        var skipNext = false
        val result = arrayListOf<Word>()
        words.forEachIndexed { index, word ->
            if (skipNext) {
                skipNext = false
                return@forEachIndexed
            }
            if (word.startsWith("--")) {
                skipNext = true
                result.add(Word(word.removePrefix("--"), words[index + 1]))
                return@forEachIndexed
            }
            result.add(Word(null, word))
        }
        return result
    }


    data class Word(val name: String?, val value: String)


    private fun noInput(input: Input): Boolean {
        return (input.words().isEmpty()
                || input.words().size == 1 && input.words()[0].trim { it <= ' ' }.isEmpty()
                || input.words().iterator().next().matches("\\s*//.*".toRegex()))
    }


    private fun List<String>.wordsForArguments(command: String): List<String> {
        val wordsUsedForCommandKey = command.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.size
        val args = ArrayList(this.subList(wordsUsedForCommandKey, this.size))
        val last = args.size - 1
        if (last >= 0 && "" == args[last]) {
            args.removeAt(last)
        }
        return args
    }

    private fun findLongestCommand(prefix: String): String? {

        val result = scriptMap.keys.stream()
            .filter { command -> prefix == command || prefix.startsWith("$command ") }
            .reduce("") { c1, c2 -> if (c1.length > c2.length) c1 else c2 }
        return if ("" == result) null else result
    }

    fun unregister(hash: Int) {
        scriptMap.remove(hashMap[hash])
    }


}
