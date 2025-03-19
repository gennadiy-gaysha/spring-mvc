package com.springboot.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class AppController {
    @GetMapping("/hello")
    /*Model is an interface provided by Spring Framework that acts as a container
    for passing data from the controller to the view*/
    /*Model allows to add attributes (key-value pairs) that can be accessed in the
    view (e.g., a Thymeleaf template)*/
    /*When the controller method is called, the model is populated with data that
    can be rendered by the view engine.*/
    public String sayHello(Model theModel){
        theModel.addAttribute("theDate", LocalDateTime.now());
        // Should match the Thymeleaf template name
        return "hellothymeleaf";
    }

}
