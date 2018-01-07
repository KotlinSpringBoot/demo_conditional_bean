package com.easy.springboot.demo_conditional_bean.util

import org.springframework.context.ApplicationContext

object SpringContextUtil {
    lateinit var applicationContext: ApplicationContext

    fun setGlobalApplicationContext(context: ApplicationContext) {
        applicationContext = context
    }

    fun getBean(beanId: String): Any {
        return applicationContext.getBean(beanId)
    }
}