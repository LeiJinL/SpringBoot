package com.jl.controller;

import com.jl.vo.StudentInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class MyController {

    @Value("${server.port}")
    private Integer port;
    @Value("${server.servlet.context-path}")
    private String contextpath;
    @Value("${Student.name}")
    private String name;
    @Value("${phone}")
    private Integer phone;

    @Resource
    private StudentInfo stu;

    @RequestMapping("/date")
    @ResponseBody
    public String externalData(){
        String s = "端口号:"+port+"   context path:"+contextpath+"   学生姓名:"+name+"   电话:"+phone;
        return s;
    }

    @RequestMapping("/date2")
    @ResponseBody
    public String externalData2(){
        String s = stu.toString();
        return s;
    }
}
