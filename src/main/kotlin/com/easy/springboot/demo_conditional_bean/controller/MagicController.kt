package com.easy.springboot.demo_conditional_bean.controller

import com.easy.springboot.demo_conditional_bean.service.MagicService
import com.easy.springboot.demo_conditional_bean.util.SpringContextUtil
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MagicController {

    @GetMapping("magic")
    fun magic(): String {
        try {
            val magicService = SpringContextUtil.getBean("magicService") as MagicService
            return magicService.info()
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return "null"
    }
}
