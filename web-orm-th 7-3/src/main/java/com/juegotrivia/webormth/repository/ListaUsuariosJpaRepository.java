package com.juegotrivia.webormth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juegotrivia.webormth.model.usuarios;

public interface ListaUsuariosJpaRepository extends JpaRepository<usuarios, Integer>{
		
		usuarios findByidUsuarios(Integer idUsuarios);
}


