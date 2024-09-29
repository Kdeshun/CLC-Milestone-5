package com.example.ecommerce.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    // Hardcoded user for demonstration
    private final String validUsername = "user";
    private final String validPassword = "password";

    public boolean authenticate(String username, String password) {
        return validUsername.equals(username) && validPassword.equals(password);
    }
}