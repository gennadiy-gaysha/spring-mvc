package com.springboot.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloNameController {
    // controller method to show initial HTML form
    @RequestMapping("/show-form")
    public String showForm(){
        return "input-name";
    }

    // controller method to process HTML form

    @RequestMapping("/process-form")
    public String helloName(){
        return "hello-name";
    }

}
