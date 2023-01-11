package com.bhy.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainCtroller {

    @GetMapping
    public String list(){

        return "hello,world!";
    }
}
