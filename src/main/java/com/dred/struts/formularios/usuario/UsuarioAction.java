package com.dred.struts.formularios.usuario;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class UsuarioAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

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
	
	
}
