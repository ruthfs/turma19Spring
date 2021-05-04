package com.generation.MyGameStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.MyGameStore.model.Products;

public interface ProductsRepository extends JpaRepository<Products, Long> {

}
