package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")

public class LoginController {

    @Autowired
    private HttpSession session;

    @RequestMapping("")
    public String index(){
        return "login-form";
    }

    @RequestMapping("/input-login")
    public String inputLogin(String mail, String password){
        if ("test@example.com".equals(mail) && "123".equals(password)) {
            session.setAttribute("mail", mail);
            session.setAttribute("password", password);
            return "login-success";
        } else {
            return "login-form";
        }
    }

    @RequestMapping("/mypage")
    public String myPage(){
        return "login-mypage";
    }

}
