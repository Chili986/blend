package com.juegotrivia.webormth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juegotrivia.webormth.model.Pregunta;
import com.juegotrivia.webormth.model.Respuesta;
import com.juegotrivia.webormth.repository.PreguntasJpaRepository;
import com.juegotrivia.webormth.repository.RespuestasJpaRepository;

@Controller
@RequestMapping("/cargas")
public class PyrController {

	@Autowired
	private PreguntasJpaRepository preguntasJpaRepository;
	@Autowired
	private RespuestasJpaRepository respuestasJpaRepository;
	
	@PostMapping ("")
	public String guardarPregunta (Pregunta preguntaACrear, Respuesta respuestaACrear) {
			this.preguntasJpaRepository.save(preguntaACrear);
		this.respuestasJpaRepository.save(respuestaACrear);
		return "pregYresp/carga.html";
		
	}
	
	@GetMapping ("/preguntas")
		public String guardarPregunta2 ( /*Pregunta preguntaACrear2*/ Respuesta respuestaACrear2) {
			return "/preguntas";
		}
	
}
