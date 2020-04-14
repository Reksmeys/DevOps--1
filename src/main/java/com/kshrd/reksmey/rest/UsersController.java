package com.kshrd.reksmey.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    public UsersController() {
    }
    @GetMapping("/api")
    public String getUser(){
        return "<h1 align='center'>Try to deploy using ROOT : if error just use contextpath: /</h1>";
    }
}
