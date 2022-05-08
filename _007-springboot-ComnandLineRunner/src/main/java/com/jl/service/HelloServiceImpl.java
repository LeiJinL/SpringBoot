package com.jl.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        String s = "hello"+name;
        return s;
    }
}
