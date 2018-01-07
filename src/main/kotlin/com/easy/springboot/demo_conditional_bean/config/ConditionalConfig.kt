package com.easy.springboot.demo_conditional_bean.config

import com.easy.springboot.demo_conditional_bean.condition.MagicCondition
import com.easy.springboot.demo_conditional_bean.service.MagicServiceImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Conditional
import org.springframework.context.annotation.Configuration


@Configuration
@ComponentScan(basePackages = ["com.easy.springboot.demo_conditional_bean"])
class ConditionalConfig {
    @Bean
    @Conditional(MagicCondition::class) //指定条件类
    fun magicService(): MagicServiceImpl {
        return MagicServiceImpl()
    }
}