package com.yana.ChawApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yana.ChawApp.Model.Order;

public interface OrderRepository extends JpaRepository <Order, Long> {

}
