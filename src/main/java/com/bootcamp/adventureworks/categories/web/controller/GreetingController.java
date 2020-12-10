package com.bootcamp.adventureworks.categories.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class GreetingController {

    @GetMapping
    String hello(){
        return "Hello Categories";
    }
}
