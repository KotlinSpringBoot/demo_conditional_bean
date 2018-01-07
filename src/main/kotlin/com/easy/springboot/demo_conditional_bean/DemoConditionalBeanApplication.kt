package com.easy.springboot.demo_conditional_bean

import com.easy.springboot.demo_conditional_bean.util.SpringContextUtil
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoConditionalBeanApplication

fun main(args: Array<String>) {
    val context = runApplication<DemoConditionalBeanApplication>(*args)
    SpringContextUtil.setGlobalApplicationContext(context)
}
