package com.example.ecommerce.controller;

import com.example.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // Refers to login.html
    }

    @PostMapping("/login")
    public String loginUser(String username, String password, Model model) {
        if (userService.authenticate(username, password)) {
            return "redirect:/"; // Redirect to main page after successful login
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login"; // Show login page with error
        }
    }
}