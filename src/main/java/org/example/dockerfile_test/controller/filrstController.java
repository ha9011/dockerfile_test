package org.example.dockerfile_test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class filrstController {

    @Value("${server.env.test}")
    private String test;
    @GetMapping("/first")
    public String helloWorld(Model model) {
        model.addAttribute("message", "hello world");
        model.addAttribute("env", test);
        return "first"; // templates/first.html로 이동
    }
}
