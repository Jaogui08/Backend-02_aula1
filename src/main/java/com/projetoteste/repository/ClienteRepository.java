package com.projetoteste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoteste.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
