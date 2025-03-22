package com.springboot.thymeleaf.controller;

import com.springboot.thymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @GetMapping("/user-form")
    public String showUserForm(Model model){
        model.addAttribute("user", new User());
        return "user-form";
    }

    @PostMapping("/processed-user-form")
    public String processUserForm(@ModelAttribute("user") User theUser){
        System.out.println(theUser);

        return "processed-user-form";
    }
}
