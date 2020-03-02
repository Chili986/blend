package com.juegotrivia.webormth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juegotrivia.webormth.model.usuarios;
import com.juegotrivia.webormth.repository.usuarioJpaRepository;

@Controller
@RequestMapping("/logeo")
public class loginController {
	
	@Autowired
	private usuarioJpaRepository UsuarioJpaRepository;
	
	@GetMapping()
	public String irAlLogin() {
		return "login";
	}
	
	@PostMapping()
	public String chequeoUsuario(Model model, usuarios user) {
		
		String mailIngresado = user.getEmail();
		String contraIngresada = user.getPassword();
		
		usuarios usuarioEncontrado = UsuarioJpaRepository.findByEmail(mailIngresado);
		
		if(usuarioEncontrado == null ) {
			return "error/404.html";
		}
		
		if(usuarioEncontrado.getPassword().equals(contraIngresada)) {
			model.addAttribute("mail",usuarioEncontrado.getEmail());
			return "partida/partida.html";
		}else {
		return "error/404.html";
		}
	}
}
