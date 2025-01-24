package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.ServletContext;

@Controller
@RequestMapping("/chat")

public class Ex16Controller {

    @Autowired
    private ServletContext application;

    @RequestMapping("")
    public String index(){
        application.getAttribute(null);
        return "ex-16";
    }

    public String post(){}{
        
        return "ex-16";
    }
}


