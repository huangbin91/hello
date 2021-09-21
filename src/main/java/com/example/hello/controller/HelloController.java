package com.example.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class HelloController {

    @RequestMapping("/getStr")
    public  String getStr(){
        return "hello world!";
    }
}
