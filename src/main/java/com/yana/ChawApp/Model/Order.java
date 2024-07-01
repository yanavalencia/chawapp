package com.yana.ChawApp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ordertbl")
public class Order {

    private @Id
    @GeneratedValue long id;
    private Long userId;
    private double totalAmount;
    private String status;

    Order(){}
    
    public Order(Long userId, double totalAmount, String status) {
        this.userId = userId;
        this.totalAmount = totalAmount;
        this.status = status;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public long getId() {
        return id;
    }
    public Long getUserId() {
        return userId;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
    public String getStatus() {
        return status;
    }
    

}