package com.example.facialrecognitionapi.Controller;

import org.springframework.web.bind.annotation.*;
import com.example.facialrecognitionapi.model.UserRegistration;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping("/{id}")
    public String getUser(@PathVariable Long id) {
        return "User with ID: " + id;
    }

    @PostMapping("/register")
    public String registerUser(@RequestBody UserRegistration userRegistration) {
        // 사용자 등록 로직
        return "User registered: " + userRegistration.getName();
    }
}
