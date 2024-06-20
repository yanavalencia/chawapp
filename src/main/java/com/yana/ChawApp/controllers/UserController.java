package com.yana.ChawApp.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.yana.ChawApp.Model.UserModel;

@RestController
public class UserController {
  @GetMapping("/user")
    public UserModel getUser(){
        return new UserModel(1 ,"yana", "yana@gamail.com", "yana22");

    }
@GetMapping("/users")
    public List<UserModel> getUsers(){
      List<UserModel> users = new ArrayList<>();
      users.add(new UserModel(1,"yana","yanalaurice@gmail.com","yana22"));
      users.add(new UserModel(1,"iver","iver@gmail.com","iver22"));
      users.add(new UserModel(1,"melvin","melvin@gmail.com","melvin22"));
      return users;

    }
    @GetMapping("/user/{name}")
    public UserModel getUserFromName(@PathVariable("name")String name){
      return new UserModel(1, "yana", "yanalaurice@gmail.com", "yana22");
    }
}
