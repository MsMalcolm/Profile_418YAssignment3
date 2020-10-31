package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProfileController {
  
    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/edit")
    public String edit(){
        return "edit";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}