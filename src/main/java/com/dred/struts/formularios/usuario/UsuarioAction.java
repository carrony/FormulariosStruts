package com.dred.struts.formularios.usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class UsuarioAction extends ActionSupport {// implements Preparable{

	private static final long serialVersionUID = 1L;

	// Objeto que se almacenará en el ValueStack
	private Usuario usuario;
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	

	@Override
	public String execute() throws Exception {
		return Action.SUCCESS;
	}

/*	@Override
	public void prepare() throws Exception {
		this.rellenaListas();
		
	}
	
	*/
	
}
