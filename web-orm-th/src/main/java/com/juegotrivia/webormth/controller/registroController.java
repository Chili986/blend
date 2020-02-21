package com.juegotrivia.webormth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.juegotrivia.webormth.model.usuarios;
import com.juegotrivia.webormth.repository.usuarioJpaRepository;

@Controller
@RequestMapping("/registro")
public class registroController {
	
	@Autowired
	private usuarioJpaRepository UsuarioJpaRepository;
	
	@PostMapping("")
	public usuarios guardarUsuario( usuarios usuariosACrear) {
		this.UsuarioJpaRepository.save(usuariosACrear);
		return usuariosACrear;
	}
	
	@GetMapping("")
	public String guardarUsuario2(usuarios usuariosACrear2) {
		return "/index.html";
	}
	
	
	
}
