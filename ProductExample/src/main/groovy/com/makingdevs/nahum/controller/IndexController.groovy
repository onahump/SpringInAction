package com.makingdevs.nahum.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
public class IndexController{
    @RequestMapping("/")
    String index(){
        "index"
    }
}