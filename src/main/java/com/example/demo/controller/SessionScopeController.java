package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/session-scope") // th:action="@{/session-scope/input-name}" htmlで書いたこの部分

public class SessionScopeController {

    @Autowired
    private HttpSession session;

    @RequestMapping("") // URLの指定（ここは一旦空）
    public String index(){
        return "session-scope-form"; //作ったhtmlの名前
    }

    @RequestMapping("/input-name")
    public String inputName(String name){ // <input type="text" name="name"> htmlで書いたこの部分
        session.setAttribute("name", name);
            return "result-session-scope1";
    }

    @RequestMapping("/to-page1")
        public String toPage1(){
            return "result-session-scope1";
    }

    @RequestMapping("/to-page2")
        public String toPage2(){
            return "result-session-scope2";
    }

    @RequestMapping("/to-page3")
        public String toPage3(){
            return "result-session-scope3";
    }
}
