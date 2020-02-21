package com.juegotrivia.webormth.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juegotrivia.webormth.model.usuarios;
import com.juegotrivia.webormth.repository.usuarioJpaRepository;


@RestController
@RequestMapping("usuarios")
public class usuarioController {
	
	@Autowired
	private usuarioJpaRepository UsuarioJpaRepository;
	
	@GetMapping("")
	public List<usuarios> getUsuarios(){
		List<usuarios> usuarios = UsuarioJpaRepository.findAll();
		return usuarios;
    }
	
	@GetMapping("{id}")
	public usuarios getUsuarioById(@PathVariable("id") Integer idUsuarios) {
		Optional<usuarios> unOptionalUsuario = UsuarioJpaRepository.findById(idUsuarios);
		return unOptionalUsuario.get();
	}
	
	@PostMapping("")
	public usuarios insertUsuario(@RequestBody usuarios unUsuarioARegistrar) {
		usuarios unUsuarioRegistrado = UsuarioJpaRepository.save(unUsuarioARegistrar);
		return unUsuarioRegistrado;
	}
	
	@PostMapping("registro")
	public usuarios createUsuario(@RequestBody usuarios usuarioACrear) {
		usuarios usuarioCreado = UsuarioJpaRepository.save(usuarioACrear);
		return usuarioCreado;
	}
	
	@PostMapping("/usuarios")
	public String guardarUsuario(@RequestBody usuarios usuarioACrear2) {
		this.UsuarioJpaRepository.save(usuarioACrear2);
		return "Grabado el usuario";
	}


	@DeleteMapping("{id}")
	public void deleteUsuario(@PathVariable("id") Integer idUsuarios) {
		UsuarioJpaRepository.deleteById(idUsuarios);
	}
}
