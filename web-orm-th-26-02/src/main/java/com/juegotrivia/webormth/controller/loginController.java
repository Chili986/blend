package com.juegotrivia.webormth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juegotrivia.webormth.repository.usuarioJpaRepository;

@Controller
@RequestMapping("/logeo")
public class loginController {
	
	@Autowired
	private usuarioJpaRepository UsuarioJpaRepository;
	
	
}
