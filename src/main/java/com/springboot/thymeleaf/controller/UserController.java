package com.springboot.thymeleaf.controller;

import com.springboot.thymeleaf.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {
    @Value("${countries}")
    List<String> countries;

    @Value("${systems}")
    List<String> systems;

    @Value("${languages}")
    List<String> languages;

    @GetMapping("/user-form")
    public String showUserForm(Model model){
        model.addAttribute("user", new User());
        model.addAttribute("countries", countries);
        model.addAttribute("languages", languages);
        model.addAttribute("systems", systems);
        return "user-form";
    }

    @PostMapping("/processed-user-form")
    public String processUserForm(@ModelAttribute("user") User theUser){
        System.out.println(theUser);

        return "processed-user-form";
    }
}
