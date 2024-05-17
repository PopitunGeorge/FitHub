package com.example.login.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    private Map<String, String> userDatabase = new HashMap<>();

    @PostMapping
    public String login(@RequestParam String username, @RequestParam String password) {
        userDatabase.put(username, password);
        return "User logged in successfully!";
    }

    @GetMapping("/users")
    public Map<String, String> getUsers() {
        return userDatabase;
    }
}
