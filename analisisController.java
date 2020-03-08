package com.juegotrivia.webormth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juegotrivia.webormth.model.Partidas;
import com.juegotrivia.webormth.model.Respuesta;
import com.juegotrivia.webormth.repository.RespuestasJpaRepository;

@Controller
@RequestMapping("/analizar")
public class analisisController {

	
	@Autowired
	private RespuestasJpaRepository respuestasJpa;
	
	@PostMapping()
	public String analizarRespuesta(Model model, Partidas res, Respuesta resp) {
		String respondio = res.getRespondido();
		
		
		 Integer iId = Integer.parseInt(res.getNumero());
		 
		 
		 
		Respuesta posta = respuestasJpa.findByIdRespuestas(iId);
		
		
		if (respondio.equals(posta.getRespuesta_correcta())) {
			
			return "/partida/correcta.html";
			}
			else {
				return "/partida/incorrecta.html";
			}
		
		
	}
}
