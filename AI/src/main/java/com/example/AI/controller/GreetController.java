package com.example.AI.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GreetController {

    private final Greeting greeting;

    @GetMapping("/hi")
    public String wish(@RequestParam (value="name") String name){

        return greeting.message(name);
    }
}
