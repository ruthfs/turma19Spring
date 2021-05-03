package com.generation.FarmarciaGen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.FarmarciaGen.model.Categoria;
 
//repositórios são feitos na interface

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
