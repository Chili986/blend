package com.juegotrivia.webormth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juegotrivia.webormth.model.categorias;

public interface CategiasJpaRepository extends JpaRepository<categorias, Integer>{
	
	categorias findByidCategorias(Integer idCategorias);

}
