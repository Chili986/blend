package com.juegotrivia.webormth.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class categorias {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer idCategorias;
	
	@Column
	private String nombre_categoria;

	
	public categorias() {
		
	}
	
	public categorias(Integer idCategorias, String nombre_categoria) {
		super();
		this.idCategorias = idCategorias;
		this.nombre_categoria = nombre_categoria;
	}

	public Integer getIdCategorias() {
		return idCategorias;
	}

	public void setIdCategorias(Integer idCategorias) {
		this.idCategorias = idCategorias;
	}

	public String getNombre_categoria() {
		return nombre_categoria;
	}

	public void setNombre_categoria(String nombre_categoria) {
		this.nombre_categoria = nombre_categoria;
	}
	
	
}
