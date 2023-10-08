package com.example.ecomapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String getOrder(){
        return "You are hitting controller at /";
    }

}
