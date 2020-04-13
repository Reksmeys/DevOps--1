package com.kshrd.reksmey.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    public UsersController() {
    }
    @GetMapping("/api")
    public String getUser(){
        return "<p>Hello chhaya & mey, let test my website I start deploy using jenkins</p>";
    }
}
