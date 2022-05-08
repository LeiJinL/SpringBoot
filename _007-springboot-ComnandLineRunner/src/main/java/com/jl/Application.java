package com.jl;

import com.jl.service.HelloService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Resource
    private HelloService helloService;

    public static void main(String[] args) {
        System.out.println("准备创建容器对象");
        SpringApplication.run(Application.class, args);
        System.out.println("创建完容器对象结束");
    }

    @Override
    public void run(String... args) throws Exception {
        //可做自定义操作，这个方法里的内容是创建容器后自动执行的
        String zs = helloService.sayHello("张三");
        System.out.println(zs);
        System.out.println("在容器创建好，执行的方法");
    }
}
