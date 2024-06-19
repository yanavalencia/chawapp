package com.yana.ChawApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yana.ChawApp.Model.UserModel;

@RestController
public class UserController {
  @GetMapping("/user")
    public UserModel getUser(){
        return new UserModel(1 ,"yana", "yana@gamail.com", "yana22");

    }
}
