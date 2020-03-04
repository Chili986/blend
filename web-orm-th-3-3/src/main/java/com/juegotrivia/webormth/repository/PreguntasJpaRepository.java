package com.juegotrivia.webormth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juegotrivia.webormth.model.Pregunta;

public interface PreguntasJpaRepository extends JpaRepository<Pregunta, Integer>{

		Pregunta findByIdPregunta(Integer id_Pregunta);
}
