package com.example.userdetailsapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    @GetMapping("/")
    public String index() {
        return "index"; // Serves index.html
    }

    @GetMapping("/user-form")
    public String userForm() {
        return "user"; // Serves user.html
    }
}
