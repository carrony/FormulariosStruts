package com.dred.struts.formularios.proyectos;

import com.opensymphony.xwork2.ActionSupport;

public class ProyectoAccion extends ActionSupport{
	
	Proyecto proyecto;

	public String execute() throws Exception {
		return SUCCESS;
	}
	
	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

}
