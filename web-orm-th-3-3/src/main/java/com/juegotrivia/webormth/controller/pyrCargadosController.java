package com.juegotrivia.webormth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juegotrivia.webormth.model.Pregunta;
import com.juegotrivia.webormth.model.Respuesta;
import com.juegotrivia.webormth.repository.PreguntasJpaRepository;
import com.juegotrivia.webormth.repository.RespuestasJpaRepository;

@Controller
@RequestMapping("/pyr")
public class pyrCargadosController {
	
	@Autowired
	private PreguntasJpaRepository preguntasJpaRepository;
	@Autowired
	private RespuestasJpaRepository respuestasJpaRepository;
	
	@GetMapping()
	
	public String mostrarpreguntas (Model model) {
		model.addAttribute("preguntas", preguntasJpaRepository.findAll());
		model.addAttribute("respuestas", respuestasJpaRepository.findAll());
		return "tablas/tablaspyr.html";
	}
}
