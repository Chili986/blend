package com.juegotrivia.webormth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juegotrivia.webormth.model.preguntas;

public interface PreguntasJpaRepository extends JpaRepository<preguntas, Integer>{

}
