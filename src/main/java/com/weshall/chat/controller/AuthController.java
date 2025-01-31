package com.weshall.chat.controller;

import com.weshall.chat.Service.UserService;
import com.weshall.chat.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private UserService userservice;

    @PostMapping("/login")
    public String login(){
        return "user logedin successfully";
    }

    @PostMapping("/Signup")
    public user singup(@RequestBody user user){
        return userservice.Register(user);
    }
}
