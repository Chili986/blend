package com.juegotrivia.webormth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class htmlController {
	
	@GetMapping("inicio")
	public String IrAlHome() {
		return"./home/inicio";
	}
	
	/*@GetMapping("")
	public String IrAlHome2() {
		return"./home/inicio";
	}*/

	@GetMapping("login")
	public String IrAlLogin() {
		return"./login/login";
	}
	
	@GetMapping("faq")
	public String IrAlfaq() {
		return"./preguntas/preguntas";
	}
	
	@GetMapping("registro")
	public String IrAlRegistro() {
		return"./registro/registro";
	}
	
	@GetMapping("eleccion")
	public String IrALaPartida() {
		return"./partida/partida";
	}
	
	@GetMapping("partida")
	public String IrALaPartida2() {
		return"./partida/partida-activa";
	}
	
	@GetMapping("prueba")
	public String IrALaPrueba() {
		return"./prueba";
	}
	
	@GetMapping("carga")
	public String IrALaCarga() {
		return"./pregYresp/carga.html";
	}
	
	@GetMapping("admin")
	public String IrAlAdmin() {
		return("./admin/admin.html");
	}
	
	@GetMapping("tabla")
	public String IrALaTabla() {
		return("./tablas/tablas.html");
	}
	
	@GetMapping("tablaspyr")
	public String IrALaTablapyr() {
		return("./tablas/tablaspyr.html");
	}
}
