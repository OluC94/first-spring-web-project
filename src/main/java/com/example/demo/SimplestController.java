package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimplestController {

    @GetMapping("/")
    public String serveRootRequest() {
        return "Hello from my Spring Web Java App";
    }

    @GetMapping("/joke")
    public String serveJokeRequest() {
        return "How much do rainbows weigh?  Not much - they're pretty light.";
    }

    @GetMapping("/practice")
    public String servePracticeRequest() {
        return "This is my practice endpoint";
    }
}