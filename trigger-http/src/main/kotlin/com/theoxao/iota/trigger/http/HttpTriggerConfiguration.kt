package com.theoxao.iota.trigger.http

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

/**
 * @author theoxao
 * @date 2019/5/28
 */

@Configuration
@ConfigurationProperties(prefix = "iota.trigger.http")
open class HttpTriggerConfiguration {

    open var ignoreSuffix: Boolean = false

}
