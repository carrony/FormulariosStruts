package com.dred.struts.formularios.usuario;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String apellidos;
	private String email;
	private String password;
	private String provincia;
	private Date fechaNac;
	private String genero;
	private ArrayList<String> lenguajes;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public ArrayList<String> getLenguajes() {
		return lenguajes;
	}
	public void setLenguajes(ArrayList<String> lenguajes) {
		this.lenguajes = lenguajes;
	}
	
}
