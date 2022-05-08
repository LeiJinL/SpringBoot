package com.jl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloBoot {

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String helloBoot(){
        String s ="Hello Spring Boot";
        return s;
    }
}
