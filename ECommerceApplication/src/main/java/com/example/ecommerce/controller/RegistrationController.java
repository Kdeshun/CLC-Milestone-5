package com.example.ecommerce.controller;

import com.example.ecommerce.model.User;
import com.example.ecommerce.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

@Controller
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register"; // Refers to register.html
    }

    @PostMapping("/register")
    public String registerUser(User user, Model model) {
        if (registrationService.registerUser(user.getFirstName(), user.getLastName(), user.getEmail(), user.getPhoneNumber(), user.getUsername(), user.getPassword())) {
            return "redirect:/"; // Redirect to main page after registration
        } else {
            model.addAttribute("error", "Registration failed");
            return "register"; // Show registration page with error
        }
    }
}