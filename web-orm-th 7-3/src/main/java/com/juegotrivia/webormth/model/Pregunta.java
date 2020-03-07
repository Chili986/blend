package com.juegotrivia.webormth.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pregunta {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer idPregunta;
	
	@Column
	private String preguntas;

	@Column
	private String categorias;

	
	public Pregunta() {
	
	}


	public Pregunta(Integer idPregunta, String preguntas, String categorias) {
		super();
		this.idPregunta = idPregunta;
		this.preguntas = preguntas;
		this.categorias = categorias;
	}


	public Integer getIdPregunta() {
		return idPregunta;
	}


	public void setIdPregunta(Integer idPregunta) {
		this.idPregunta = idPregunta;
	}


	public String getPreguntas() {
		return preguntas;
	}


	public void setPreguntas(String preguntas) {
		this.preguntas = preguntas;
	}


	public String getCategorias() {
		return categorias;
	}


	public void setCategorias(String categorias) {
		this.categorias = categorias;
	}
 
	
}
