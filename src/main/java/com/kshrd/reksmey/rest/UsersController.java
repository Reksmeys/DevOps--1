package com.kshrd.reksmey.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    public UsersController() {
    }
    @GetMapping("/api")
    public String getUser(){
        return "1234567890987654";
    }
}
