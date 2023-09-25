package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestContorller {
    @GetMapping("/test")
    @ResponseBody
    public String testPath() {
        return "hello";
    }
}
