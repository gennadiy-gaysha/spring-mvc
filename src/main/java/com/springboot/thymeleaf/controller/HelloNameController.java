package com.springboot.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloNameController {
    // controller method to show initial HTML form
    @RequestMapping("/show-form")
    public String showForm(){
        return "input-name";
    }

    // controller method to process HTML form
    @RequestMapping("/process-form")
    // Assign theName to value of request parameter - userName
    public String helloName(@RequestParam("userName") String theName, Model model){
        // convert the data to all caps
        String result = theName.toUpperCase();

        // add message to the model
        model.addAttribute("message", result);
        return "hello-name";
    }

}
