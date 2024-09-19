package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // http://localhost:8081/home
    @GetMapping("/home")
    public String home(){
        return "home"; // home.html
    }
}
