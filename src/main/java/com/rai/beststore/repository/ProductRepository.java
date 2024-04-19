package com.rai.beststore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rai.beststore.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
