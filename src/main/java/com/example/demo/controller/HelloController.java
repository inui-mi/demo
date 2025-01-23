package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")

public class HelloController {

    @RequestMapping("/index")
    public String index(){
        //return "hello-world";
        return "redirect:/hello/index2";
    }
    @RequestMapping("/index2")
    public String inden2(){
        return "hello-world";
    }
}