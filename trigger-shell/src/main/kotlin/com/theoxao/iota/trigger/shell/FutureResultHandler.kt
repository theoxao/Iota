package com.theoxao.iota.trigger.shell

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.future.await
import org.springframework.shell.result.TerminalAwareResultHandler
import java.util.concurrent.CompletableFuture

/**
 * @author theo
 * @date 19-8-15
 */
class FutureResultHandler<T> : TerminalAwareResultHandler<T>() {
    override fun doHandleResult(result: T) {
        val defer =
            if (result is CompletableFuture<*>)
                GlobalScope.async {
                    terminal.writer().println(result.nestedAwait().toString())
                }
            else
                GlobalScope.async {
                    terminal.writer().println(result.toString())
                }
        do {
        } while (!defer.isCompleted)
    }


    private suspend fun CompletableFuture<*>.nestedAwait(): Any {
        val await = this.await()
        if (await is CompletableFuture<*>) {
            return await.nestedAwait()
        }
        return await
    }


}