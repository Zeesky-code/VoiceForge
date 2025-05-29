package com.voiceforge.voiceforge.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class WebController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
