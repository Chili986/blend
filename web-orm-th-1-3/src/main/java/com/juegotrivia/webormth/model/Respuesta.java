package com.juegotrivia.webormth.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Respuesta {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer idRespuestas;
	
	@Column()
	private String respuesta_correcta;
	
	@Column()
	private String respuesta_incorrecta_1;
	
	@Column()
	private String respuesta_incorrecta_2;
	
	@Column()
	private String respuesta_incorrecta_3;

	public Respuesta(Integer idRespuestas, String respuestas_correcta, String respuestas_incorrecta_1,
			String respuestas_incorrecta_2, String respuestas_incorrecta_3) {
		super();
		this.idRespuestas = idRespuestas;
		this.respuesta_correcta = respuestas_correcta;
		this.respuesta_incorrecta_1 = respuestas_incorrecta_1;
		this.respuesta_incorrecta_2 = respuestas_incorrecta_2;
		this.respuesta_incorrecta_3 = respuestas_incorrecta_3;
	}

	public Integer getIdRespuestas() {
		return idRespuestas;
	}

	public void setIdRespuestas(Integer idRespuestas) {
		this.idRespuestas = idRespuestas;
	}

	public String getRespuesta_correcta() {
		return respuesta_correcta;
	}

	public void setRespuesta_correcta(String respuesta_correcta) {
		this.respuesta_correcta = respuesta_correcta;
	}

	public String getRespuesta_incorrecta_1() {
		return respuesta_incorrecta_1;
	}

	public void setRespuesta_incorrecta_1(String respuesta_incorrecta_1) {
		this.respuesta_incorrecta_1 = respuesta_incorrecta_1;
	}

	public String getRespuesta_incorrecta_2() {
		return respuesta_incorrecta_2;
	}

	public void setRespuesta_incorrecta_2(String respuesta_incorrecta_2) {
		this.respuesta_incorrecta_2 = respuesta_incorrecta_2;
	}

	public String getRespuesta_incorrecta_3() {
		return respuesta_incorrecta_3;
	}

	public void setRespuesta_incorrecta_3(String respuesta_incorrecta_3) {
		this.respuesta_incorrecta_3 = respuesta_incorrecta_3;
	}
	
	
}
