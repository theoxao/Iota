package com.theoxao.iota.trigger.shell

import com.theoxao.iota.trigger.shell.FutureResultHandler
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary

/**
 * @author theo
 * @date 19-8-16
 */
@Configuration
open class FutureResultHandlerConfiguration {

    @Bean
    @Primary
    @Qualifier("future")
    open fun futureResultHandler(): FutureResultHandler<Any> {
        return FutureResultHandler()
    }
}