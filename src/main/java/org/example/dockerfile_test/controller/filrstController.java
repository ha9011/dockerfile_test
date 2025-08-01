package org.example.dockerfile_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class filrstController {
    @GetMapping("/first")
    public String helloWorld(Model model) {
        model.addAttribute("message", "hello world");
        return "first"; // templates/first.html로 이동
    }
}
