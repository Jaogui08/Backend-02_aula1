package com.projetoteste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoteste.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
