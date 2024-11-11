package com.example.facialrecognitionapi.Service;

import com.example.facialrecognitionapi.model.UserRegistration;
import com.example.facialrecognitionapi.repository.UserRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {

    @Autowired
    private UserRegistrationRepository userRegistrationRepository;

    public UserRegistration registerUser(UserRegistration user) {
        return userRegistrationRepository.save(user);
    }

    public UserRegistration getUserByName(String name) {
        return userRegistrationRepository.findByName(name);
    }
}
