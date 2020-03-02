package com.juegotrivia.webormth.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class usuarios {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer idUsuarios;
	
	@Column(unique = true, nullable = false)
	@NotNull(message = "El campo usuario no puede estar vacio")
	@NotBlank
	@Size(min = 5,max = 12, message = "El usuario debe tener entre 5 y 12 caracteres")
	/*@Pattern(regexp = "dfsa")*/
	private String usuario;
	
	@Column(nullable = false)
	private String password;
	
	@Column(unique = true, nullable = false)
	private String email;
	
	@Column()
	private String pais;
	
	@Column()
	private String sexo;
	
	@Column()
	private Date fecha_nacimiento;
	
	@Column()
	private String avatar;
	
	/*------*/
	
	public usuarios() {
		
	}

	
	

	public usuarios(Integer idUsuarios, String usuario, String avatar, String password, String email, String pais, String sexo,
			Date fecha_nacimiento) {
		super();
		this.idUsuarios = idUsuarios;
		this.usuario = usuario;
		this.avatar = avatar;
		this.password = password;
		this.email = email;
		this.pais = pais;
		this.sexo = sexo;
		this.fecha_nacimiento = fecha_nacimiento;
	}




	public String getAvatar() {
		return avatar;
	}




	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}




	public Integer getIdUsuarios() {
		return idUsuarios;
	}


	public void setIdUsuarios(Integer idUsuarios) {
		this.idUsuarios = idUsuarios;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}


	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	

	
	
}
