package com.example.springgrafanatest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class TestController {
    @GetMapping(value = "test")
    public String test() {
        return "test";
    }

}
