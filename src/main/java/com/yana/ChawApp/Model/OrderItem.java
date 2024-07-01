package com.yana.ChawApp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class OrderItem {

    private @Id
    @GeneratedValue long id;
    private Long orderId;
    private Long productId;
    private int quantity;
    private double price;

    OrderItem(){}
    
    public OrderItem(Long orderId,Long productId, int quantity, double price) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity =quantity;
        this.price = price;
    }
    

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }
  
    

}