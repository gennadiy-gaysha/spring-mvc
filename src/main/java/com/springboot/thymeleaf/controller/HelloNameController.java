package com.springboot.thymeleaf.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    // HttpServletRequest request - holds HTML form data
    // Container for the data added by programmer
    public String helloName(HttpServletRequest request, Model model){
        // read the request parameter from the HTML form
        String theName = request.getParameter("userName");

        // convert the data to all caps
        String result = theName.toUpperCase();

        // add message to the model
        model.addAttribute("message", result);
        return "hello-name";
    }

}
