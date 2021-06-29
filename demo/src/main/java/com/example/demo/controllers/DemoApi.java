package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoApi {

    @RequestMapping("/index")
    public String index(){
        return "index of api";
    }
}
