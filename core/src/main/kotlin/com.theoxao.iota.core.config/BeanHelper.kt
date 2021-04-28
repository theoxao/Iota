package com.theoxao.iota.core.config

import com.theoxao.iota.base.model.BeanInfo
import org.springframework.beans.factory.support.BeanDefinitionBuilder
import org.springframework.beans.factory.support.DefaultListableBeanFactory
import org.springframework.context.ApplicationContext
import org.springframework.stereotype.Component

/**
 * @author theo
 * @date 19-8-30
 */
@Component
class BeanHelper(private val applicationContext: ApplicationContext) {

    private val bf = applicationContext.autowireCapableBeanFactory as DefaultListableBeanFactory
    private val cachedBeanInfo = mutableMapOf<String, BeanInfo>()

    fun registerBean(beanInfo: BeanInfo) {
        cachedBeanInfo[beanInfo.name] = beanInfo
        this.register(beanInfo.name, beanInfo.bean)
    }

    private fun register(name: String, clazz: Class<*>) {
        bf.registerBeanDefinition(name, BeanDefinitionBuilder.genericBeanDefinition(clazz).beanDefinition)
    }

    fun resolveDependency() {
        cachedBeanInfo.forEach { name, info ->

        }
    }

}