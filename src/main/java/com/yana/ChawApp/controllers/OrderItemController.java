package com.yana.ChawApp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yana.ChawApp.Model.OrderItem;
import com.yana.ChawApp.NotFoundException.OrderItemNotFoundException;
import com.yana.ChawApp.Repository.OrderItemRepository;

@RestController
public class OrderItemController {

    private final OrderItemRepository repo;

    public OrderItemController(OrderItemRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/orderItems")
    public List<OrderItem> getOrderItems() {
        return repo.findAll();
    }

    @GetMapping("/orderItem/{id}")
    public OrderItem getOrderItemById(@PathVariable Long id) {
        return repo.findById(id)
                   .orElseThrow(() -> new OrderItemNotFoundException(id));
    }

    @PostMapping("/orderItem/new")
    public String addOrderItem(@RequestBody OrderItem newOrderItem) {
        repo.save(newOrderItem);
        return "A new Order Item is added. Yey!";
    }

    @DeleteMapping("/orderItem/delete/{id}")
    public String deleteOrderItem(@PathVariable Long id) {
        repo.deleteById(id);
        return "An Order Item is deleted!";
    }
}
