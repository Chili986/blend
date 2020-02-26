package com.juegotrivia.webormth.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class preguntas {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer idRespuestas;
	
	@Column
	private String descripcion;

	
	
	public preguntas(Integer idRespuestas, String descripcion) {
		super();
		this.idRespuestas = idRespuestas;
		this.descripcion = descripcion;
	}

	public Integer getIdRespuestas() {
		return idRespuestas;
	}

	public void setIdRespuestas(Integer idRespuestas) {
		this.idRespuestas = idRespuestas;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

	
	
	
	
	
	
	
}
