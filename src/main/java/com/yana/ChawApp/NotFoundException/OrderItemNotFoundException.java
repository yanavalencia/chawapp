package com.yana.ChawApp.NotFoundException;

public class OrderItemNotFoundException extends RuntimeException {

    public OrderItemNotFoundException(Long id) {
        super("Order Item not found with id: " + id);
    }
}
