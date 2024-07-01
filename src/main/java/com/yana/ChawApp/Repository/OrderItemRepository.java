package com.yana.ChawApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yana.ChawApp.Model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
    
}
