package com.juegotrivia.webormth.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juegotrivia.webormth.model.Respuesta;
import com.juegotrivia.webormth.repository.PreguntasJpaRepository;
import com.juegotrivia.webormth.repository.RespuestasJpaRepository;

@Controller
@RequestMapping("/iniciar")
public class partidaController {
	
	/*Random randompreg = new Random();
	int n = randompreg.nextInt(4)+1;
	*/
	

	
	@Autowired
	private PreguntasJpaRepository preguntasJpa;
	
	@Autowired
	private RespuestasJpaRepository respuestasJpa;
	
	@PostMapping()
	public String mostrarPartida(Model model, Respuesta res) {
		int n = (int)(Math.random()*(5-1+1)+1);
		
		Respuesta resp = respuestasJpa.findByIdRespuestas(n);
		
		
		
		model.addAttribute("pregunta", preguntasJpa.findByIdPregunta(n));
		model.addAttribute("respuesta", respuestasJpa.findByIdRespuestas(n));
		model.addAttribute("correcta", resp.getRespuesta_correcta());
		model.addAttribute("incorrecta1", resp.getRespuesta_incorrecta_1());
		model.addAttribute("incorrecta2", resp.getRespuesta_incorrecta_2());
		model.addAttribute("incorrecta3", resp.getRespuesta_incorrecta_3());

		
		return"partida/partida-activa.html";
	}
}
