package com.juegotrivia.webormth.model;

public class Partidas {
	
	private String respondido;
	private String numero;
	
	
	public Partidas() {
		super();
	}

	public Partidas(String respondido, String numero) {
		super();
		this.respondido = respondido;
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getRespondido() {
		return respondido;
	}

	public void setRespondido(String respondido) {
		this.respondido = respondido;
	}
	
}
