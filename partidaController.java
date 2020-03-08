package com.juegotrivia.webormth.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juegotrivia.webormth.model.Pregunta;
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
	public String mostrarPartida(Model model, Respuesta res, Pregunta pres) {
		
		/*ArrayList<Integer> cantidadElementos = new ArrayList<Integer>();
		
		cantidadElementos.add((int) respuestasJpa.count());*/
		
	
		Integer prueba = (int) respuestasJpa.count();
		
		Integer n = (int)(Math.random()*(prueba-1+1)+1);
		
		Respuesta resp = respuestasJpa.findByIdRespuestas(n);
		Pregunta preg = preguntasJpa.findByIdPregunta(n);
		
		ArrayList<String> listaPreguntas = new ArrayList<String>();
		
		model.addAttribute("pregunta", preguntasJpa.findByIdPregunta(n));
		model.addAttribute("respuesta", respuestasJpa.findByIdRespuestas(n));
		model.addAttribute("correcta", resp.getRespuesta_correcta());
		model.addAttribute("incorrecta1", resp.getRespuesta_incorrecta_1());
		model.addAttribute("incorrecta2", resp.getRespuesta_incorrecta_2());
		model.addAttribute("incorrecta3", resp.getRespuesta_incorrecta_3());
		model.addAttribute("id", n);
		 
		/***********************************************************/
		
		listaPreguntas.add(resp.getRespuesta_correcta());
		listaPreguntas.add(resp.getRespuesta_incorrecta_1());
		listaPreguntas.add(resp.getRespuesta_incorrecta_2());
		listaPreguntas.add(resp.getRespuesta_incorrecta_3());
		
		String pregun = preg.getPreguntas();
		
		 Random r = new Random();
		
		
		  /*
		for (int i=0; i<listaPreguntas.length; i++) {
            int posAleatoria = r.nextInt(listaPreguntas.length);
            int temp = listaPreguntas[i];
            listaPreguntas[i] = listaPreguntas[posAleatoria];
            listaPreguntas[posAleatoria] = temp;
        }
 
      System.out.println(Arrays.toString(listaPreguntas));*/
        
        System.out.println(pregun);
        System.out.println("Respuestas ordenadas: " + listaPreguntas);
        Collections.shuffle(listaPreguntas);
        System.out.println("Respuestas mezcladas: " + listaPreguntas);
        
        
        
        Iterator iter = listaPreguntas.iterator();
        while (iter.hasNext())
    
          System.out.println(iter.next());
        
        model.addAttribute("resp1", listaPreguntas.get(0));
		model.addAttribute("resp2", listaPreguntas.get(1));
		model.addAttribute("resp3", listaPreguntas.get(2));
		model.addAttribute("resp4", listaPreguntas.get(3));
  
        /*	model.addAttribute("posibles", iter.next());*/
		return"partida/partida-activa.html";
		
		
	}
}
