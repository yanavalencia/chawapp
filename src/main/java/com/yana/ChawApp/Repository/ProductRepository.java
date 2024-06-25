package com.yana.ChawApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yana.ChawApp.Model.Product;

public interface ProductRepository extends JpaRepository <Product, Long> {

}
