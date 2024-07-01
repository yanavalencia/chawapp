package com.yana.ChawApp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.yana.ChawApp.Model.Order;
import com.yana.ChawApp.NotFoundException.OrderNotFoundException;
import com.yana.ChawApp.Repository.OrderRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class OrderController {

    OrderRepository repo;

    public OrderController(OrderRepository repo){
        this.repo = repo;
    }

    @GetMapping("/Orders")
    public List<Order> getOrders(){
        return repo.findAll();
    }

    @GetMapping("/Order/{id}")
     public Order getOrderById(@PathVariable Long id){
       return repo.findById(id)
       .orElseThrow(()-> new OrderNotFoundException(id));
     }

    @PostMapping("/Order/new")
    public String addOrder(@RequestBody Order newOrder) {
        repo.save(newOrder);
        return "A new Order is added. Yey!";
    }


    @DeleteMapping("/Order/delete/{id}")
   public String deleteOrder (@PathVariable Long id){
    repo.deleteById(id);
    return "A Order is deleted!";
   } 
}

