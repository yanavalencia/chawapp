package com.yana.ChawApp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yana.ChawApp.Model.Product;
import com.yana.ChawApp.Repository.ProductRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ProductController {

    ProductRepository repo;

    public ProductController(ProductRepository repo){
        this.repo = repo;
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        return repo.findAll();
    }

    // public Product getProduct(Long id){
    //     return repo.findById(id);
    // }

    @PostMapping("/product/new")
    public String addProduct(@RequestBody Product newProduct) {
        repo.save(newProduct);
        return "A new product is added. Yey!";
    }
    
}

