package com.example.facialrecognitionapi.Controller;

import com.example.facialrecognitionapi.model.UserRegistration;
import com.example.facialrecognitionapi.Service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserRegistrationController {

    @Autowired
    private UserRegistrationService userRegistrationService;

    @PostMapping("/register")
    public UserRegistration registerUser(@RequestBody UserRegistration user) {
        return userRegistrationService.registerUser(user);
    }

    @GetMapping("/{name}")
    public UserRegistration getUserByName(@PathVariable String name) {
        return userRegistrationService.getUserByName(name);
    }
}
