package com.juegotrivia.webormth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juegotrivia.webormth.model.Respuesta;

public interface RespuestasJpaRepository extends JpaRepository<Respuesta, Integer>{

	
	Respuesta findByIdRespuestas(Integer id_respuestas);
}
