package com.juegotrivia.webormth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juegotrivia.webormth.model.usuarios;
import com.juegotrivia.webormth.repository.ListaUsuariosJpaRepository;

@Controller
@RequestMapping("/listas")
public class tablaController {
	
	@Autowired
	private ListaUsuariosJpaRepository listaJpa;

	@GetMapping()
	public String mostrarUsuairos (Model model) {
		model.addAttribute("usuarios", listaJpa.findAll());
		return "tablas/tablas.html";
	}
	
}
