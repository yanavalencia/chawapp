package com.yana.ChawApp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {

    private @Id
    @GeneratedValue long id;
    private String productName;
    private String description;
    private double price;

    Product(){}
    
    public Product(String productName, String description, double price) {
        this.productName = productName;
        this.description = description;
        this.price = price;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public long getId() {
        return id;
    }
    public String getProductName() {
        return productName;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }
    

}