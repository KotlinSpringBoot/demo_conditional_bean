package com.easy.springboot.demo_conditional_bean.condition

import org.springframework.context.annotation.Condition
import org.springframework.context.annotation.ConditionContext
import org.springframework.core.env.get
import org.springframework.core.type.AnnotatedTypeMetadata

class MagicCondition : Condition {
    override fun matches(context: ConditionContext, metadata: AnnotatedTypeMetadata): Boolean {
        val env = context.getEnvironment()
        if (env.containsProperty("magic")) // 检查magic属性
        {
            val b = env["magic"]
            return b == "true"
        }
        return false
    }
}
