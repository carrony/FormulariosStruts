package com.dred.struts.formularios.usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class RellenaProvinciasAction extends ActionSupport { // implements Preparable{

	// Elementos que ayudarán a crear los componentes del formulario
	private ArrayList<String> generos;
	private List<String> lenguajes;
	private ArrayList<Provincia> provincias;
	
	
	
	public RellenaProvinciasAction() {
		this.rellenaListas();
	}
	
	private void rellenaListas() {
		this.generos =  new ArrayList<String>();
		this.generos.add("Hombre");
		this.generos.add("Mujer");
		
		this.lenguajes =  Arrays.asList(
				"Java", "Javascript", "PHP", "C++");
		
		this.provincias= new ArrayList<Provincia>();
		this.provincias.add(new Provincia("03","Almeria"));
		this.provincias.add(new Provincia("11","Cádiz"));
		this.provincias.add(new Provincia("14","Córdoba"));
		this.provincias.add(new Provincia("18","Granada"));
		this.provincias.add(new Provincia("21","Huelva"));
		this.provincias.add(new Provincia("23","Jaen"));
		this.provincias.add(new Provincia("29","Málaga"));
		this.provincias.add(new Provincia("41","Sevilla"));
	
	}

	public ArrayList<String> getGeneros() {
		return generos;
	}

	public void setGeneros(ArrayList<String> generos) {
		this.generos = generos;
	}

	public List<String> getLenguajes() {
		return lenguajes;
	}

	public void setLenguajes(ArrayList<String> lenguajes) {
		this.lenguajes = lenguajes;
	}

	public List<Provincia> getProvincias() {
		return provincias;
	}

	public void setProvincias(ArrayList<Provincia> provincias) {
		this.provincias = provincias;
	}
	

	public String execute() {
		return Action.SUCCESS;
	}
/*	@Override
	public void prepare() throws Exception {
		this.generos =  new ArrayList<String>();
		this.generos.add("Hombre");
		this.generos.add("Mujer");
		
	}*/
}

