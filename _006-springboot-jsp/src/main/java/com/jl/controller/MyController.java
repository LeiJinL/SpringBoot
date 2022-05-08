package com.jl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/jsp")
    public String JspTest(Model model){
        model.addAttribute("msg","正在使用jsp");
        return "index";
    }
}
