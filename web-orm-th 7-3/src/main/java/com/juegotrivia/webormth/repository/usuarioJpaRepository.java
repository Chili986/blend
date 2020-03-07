package com.juegotrivia.webormth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juegotrivia.webormth.model.usuarios;

public interface usuarioJpaRepository extends JpaRepository<usuarios, Integer>{
	
	usuarios findByEmail(String email);
}
