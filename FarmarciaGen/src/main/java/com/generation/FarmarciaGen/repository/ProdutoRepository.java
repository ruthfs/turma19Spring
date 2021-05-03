package com.generation.FarmarciaGen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.FarmarciaGen.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
