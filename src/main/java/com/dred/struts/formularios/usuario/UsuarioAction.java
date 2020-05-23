package com.dred.struts.formularios.usuario;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class UsuarioAction extends ActionSupport 
			implements ModelDriven {

	private static final long serialVersionUID = 1L;

	// Objeto que se almacenará en el ValueStack
	private Usuario usuario;
	// Lista de usuarios recuperada del modelo de datos
	private ArrayList<Usuario> listaUsuarios;
	
	// Se almacenará la confimacion del password para realizar la validación
	private String rePassword;
	
	@Override
	public String execute() throws Exception {
		
		UsuarioModelo.agregrarCliente(usuario);
		return Action.SUCCESS;
	}
	
	
	public String mostrar() throws Exception {
		return Action.SUCCESS;
	}
	
	@Override
	public void validate() {
		//usuario=(Usuario) getModel();
		if (usuario.getPassword()!=null && !usuario.getPassword().equals(this.getRePassword())) {
			addActionError("Las contraseñas no coinciden.");
		}
		
		if (usuario.getFechaNac()!=null) {
			LocalDateTime ahora = LocalDateTime.now();
			Instant instante = Instant.ofEpochMilli(usuario.getFechaNac().getTime());
			LocalDateTime fNac = LocalDateTime.ofInstant(instante, ZoneId.systemDefault());
			long años = ChronoUnit.YEARS.between(fNac,ahora);
			
			if (años <18) {
				addFieldError("usuario.fechaNac", "Debe ser mayor de edad para poder registrarse.");
			}
		}
	}


	public Object getModel() {
		usuario = new Usuario();
		listaUsuarios= UsuarioModelo.getListaUsuarios();
		return usuario;
	}
	
	public ArrayList<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	// Getters y setters 
	public String getRePassword() {
		return rePassword;
	}
	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
