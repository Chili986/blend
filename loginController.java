package com.juegotrivia.webormth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juegotrivia.webormth.model.usuarios;
import com.juegotrivia.webormth.repository.CategiasJpaRepository;
import com.juegotrivia.webormth.repository.usuarioJpaRepository;

@Controller
@RequestMapping("/logeo")
public class loginController {
	
	@Autowired
	private usuarioJpaRepository UsuarioJpaRepository;
	@Autowired
	private CategiasJpaRepository categoriasJpaRepository;
	
	
	@GetMapping()
	public String irAlLogin() {
		return "login";
	}
	
	@PostMapping()
	public String chequeoUsuario(Model model, usuarios user) {
		
		String mailIngresado = user.getEmail();
		String contraIngresada = user.getPassword();
		Integer admin = user.getAdmin();
		usuarios usuarioEncontrado = UsuarioJpaRepository.findByEmail(mailIngresado);
		
		model.addAttribute("categorias", categoriasJpaRepository.findAll());	

		
		
	/*	if (admin != null) {
			return "admin/admin.html";
		
		
		}*/
		if(usuarioEncontrado.getPassword().equals(contraIngresada)) {
			model.addAttribute("mail",usuarioEncontrado.getEmail());
			model.addAttribute("usuario", usuarioEncontrado.getUsuario());
			model.addAttribute("avatar",usuarioEncontrado.getAvatar());
			model.addAttribute("puntos", usuarioEncontrado.getPuntos());
			model.addAttribute("admin", usuarioEncontrado.getAdmin());
			
			if (usuarioEncontrado.getAdmin() == 1) {
				return "admin/admin.html";
			}else {
				
			return "partida/partida.html";
			}
		}
		
		else {
		return "error/404.html";
		}
	}
}


/*if(usuarioEncontrado.getAdmin().equals("1")){
	return "admin/admin.html";
}*/