package com.spring.tutorial.webstore.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {

    @RequestMapping("/")
    public String welcome(Model model) {
        model.addAttribute("greeting", "Welcome in my shop");
        model.addAttribute("tagline", "Marcin Kroszel");

        return "welcome";
    }
}