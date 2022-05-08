package com.jl.vo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller("dog")
public class Dog {
    @Value("${dog.name}")
    private String name;
    @Value("${dog.id}")
    private Integer id;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
