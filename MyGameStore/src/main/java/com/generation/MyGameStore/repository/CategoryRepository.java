package com.generation.MyGameStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.MyGameStore.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
