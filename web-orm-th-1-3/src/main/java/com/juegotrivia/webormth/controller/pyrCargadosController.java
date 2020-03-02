package com.juegotrivia.webormth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juegotrivia.webormth.model.Pregunta;
import com.juegotrivia.webormth.model.Respuesta;
import com.juegotrivia.webormth.repository.PreguntasJpaRepository;
import com.juegotrivia.webormth.repository.RespuestasJpaRepository;

@RestController
@RequestMapping("preguntas")
public class pyrCargadosController {
	
	@Autowired
	private PreguntasJpaRepository preguntasJpaRepository;
	@Autowired
	private RespuestasJpaRepository respuestasJpaRepository;
	
	@GetMapping("")
	public List<Pregunta> getPreguntas(){
		List<Pregunta> Pregunta = preguntasJpaRepository.findAll();
		return Pregunta;
	}
	public List<Respuesta> getRespuestas(){
		List<Respuesta> respuestas = respuestasJpaRepository.findAll();
		return respuestas;
	}
}
