package com.springboot.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloNameController {
    // controller method to show initial HTML form
    @GetMapping("/show-form")
    public String showForm(){
        return "input-name";
    }

    // controller method to process HTML form

    // GET: The userName is visible in the URL
    // User -> [Form: input-name.html] -> [URL with Query String] ->
    // [Controller: helloName()] -> [View: hello-name.html]

    // POST: The userName is hidden inside the request body
    // User -> [Form: input-name.html] -> [HTTP Body] ->
    // [Controller: helloName()] -> [View: hello-name.html]
    @PostMapping("/process-form")
    // Assign theName to value of request parameter - userName
    public String helloName(@RequestParam("userName") String theName, Model model){
        // convert the data to all caps
        String result = theName.toUpperCase();

        // add message to the model
        model.addAttribute("message", result);
        return "hello-name";
    }

}
