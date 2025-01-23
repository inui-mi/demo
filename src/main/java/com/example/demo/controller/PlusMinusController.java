package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.form.PlusMinusForm;
import com.example.demo.form.ResultPlusMinusForm;

@Controller
@RequestMapping("/plus-minus") 

public class PlusMinusController {
    
    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String showForm(){
        return "plus-minus-form";
    }

    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public String calculate(
        @RequestParam String num1, @RequestParam String num2,
        @RequestParam String num3, @RequestParam String num4,
        @RequestParam String num5, @RequestParam String num6,
        @RequestParam String num7, @RequestParam String num8, Model model){
        
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int n3 = Integer.parseInt(num3);
        int n4 = Integer.parseInt(num4);
        int n5 = Integer.parseInt(num5);
        int n6 = Integer.parseInt(num6);
        int n7 = Integer.parseInt(num7);
        int n8 = Integer.parseInt(num8);
        
        int resultAdd = n1 + n2;
        int resultSubtract = n3 - n4;
        int resultMultiply = n5 * n6;
        int resultDivide = n7 / n8;

        //String resultDivide;

        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("num3", num3);
        model.addAttribute("num4", num4);
        model.addAttribute("num5", num5);
        model.addAttribute("num6", num6);
        model.addAttribute("num7", num7);
        model.addAttribute("num8", num8);
        
        model.addAttribute("resultAdd", resultAdd);
        model.addAttribute("resultSubtract", resultSubtract);
        model.addAttribute("resultMultiply", resultMultiply);
        model.addAttribute("resultDivide", resultDivide);
        
        return "result-plus-minus";
    }

}
