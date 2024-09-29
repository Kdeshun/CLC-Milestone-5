package com.example.ecommerce.service;

import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    public boolean registerUser(String firstName, String lastName, String email, String phoneNumber, String username, String password) {
        // Here you can add logic to validate and "register" the user
        return true; // Simulate successful registration
    }
}