package com.mvcstudy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CoreController {

    @GetMapping("/main")
    public String main(String name, Model model) {
        model.addAttribute("test", name);
        return "test app";
    }
}
