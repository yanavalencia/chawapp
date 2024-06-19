package com.yana.ChawApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
 
    @GetMapping("/Hello-World")
   public String helloWorld(){
    return "Hello WOrld";
   } 
}
