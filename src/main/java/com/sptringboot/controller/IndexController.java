package com.sptringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping("/hello")
    @ResponseBody
    public String index(){
        System.out.println("11111111");
        return "hello Springboot";
    }
}
