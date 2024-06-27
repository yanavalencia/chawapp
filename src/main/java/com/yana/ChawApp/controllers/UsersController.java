package com.yana.ChawApp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.yana.ChawApp.Model.Users;
import com.yana.ChawApp.NotFoundException.UsersNotFoundException;
import com.yana.ChawApp.Repository.UsersRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class UsersController {

    UsersRepository repo;

    public UsersController(UsersRepository repo){
        this.repo = repo;
    }

    @GetMapping("/users")
    public List<Users> getUsers(){
        return repo.findAll();
    }

    @GetMapping("/users/{id}")
     public Users getUsers(@PathVariable Long id){
       return repo.findById(id)
       .orElseThrow(()-> new UsersNotFoundException(id));
     }

    @PostMapping("/users/new")
    public String addUsers(@RequestBody Users newUsers) {
        repo.save(newUsers);
        return "A new Users is added. Yey!";
    }

    @PutMapping("users/edit/{id}")
    public Users updateUsers(@PathVariable Long id, @RequestBody Users newUsers){
         return repo.findById(id)
         .map(Users ->{
            Users.setUserName(newUsers.getUserName());
            Users.setCourse(newUsers.getCourse());
            Users.setYear(newUsers.getYear());
            return repo.save(Users);
         }).orElseGet(()->{
            return repo.save(newUsers);
         });
    }

    @DeleteMapping("/users/delete/{id}")
   public String deleteUsers (@PathVariable Long id){
    repo.deleteById(id);
    return "A Users is deleted!";
   } 
}

