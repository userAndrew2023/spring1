package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    @GetMapping("/")
    public String greeting(@RequestParam(required = false) String user) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        if (user != null) {
            stringBuilder.append(", ").append(user);
        }
        return stringBuilder.toString();
    }
}
