package com.juegotrivia.webormth.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class respuestas {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer idRespuestas;
	
	@Column
	private String descipcion_respuesta;
	
	@Column()
	private Integer respuesta_correcta;
	
	
}
