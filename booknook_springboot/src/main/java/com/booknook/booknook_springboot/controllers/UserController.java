package com.booknook.booknook_springboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("api/usuario")
public class UserController {

    @GetMapping
    public String getMethodName() {
        return "ola mundo";
    }
    
}
