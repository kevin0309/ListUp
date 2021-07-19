package com.list.yhlist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class MainController {
    @GetMapping("/test")
    public String test() {
        return "/test.html";
    }
}
