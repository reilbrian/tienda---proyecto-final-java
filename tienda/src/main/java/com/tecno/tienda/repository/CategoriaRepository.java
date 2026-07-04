package com.tecno.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecno.tienda.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    
} 
