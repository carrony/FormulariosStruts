package com.dred.struts.formularios.usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class UsuarioModelo {

	private static ArrayList<Usuario> listaUsuarios;
	private static int id;
	static {
		listaUsuarios=new ArrayList<Usuario>();
		// Datos de ejemplo para simular la BBDD
		listaUsuarios.add(new Usuario(++id,"Ana", "Márquez","amarquez@correo.es",
				"aA123456!", "Sevilla",new Date(1,10,1980), "Mujer", 
				new ArrayList<String>(Arrays.asList("c++","Java"))));
		listaUsuarios.add(new Usuario(++id,"Juan", "López","jualpz@correo.es",
				"aI1y47O6!", "Málaga",new Date(1,10,2000), "Hombre", 
				new ArrayList<String>(Arrays.asList("c++"))));
		listaUsuarios.add(new Usuario(++id,"María", "Sánchez","msanchez@correo.es",
				"10AA10#b", "Córdoba",new Date(21,01,1995), "Mujer", 
				new ArrayList<String>(Arrays.asList("c++","python"))));
		listaUsuarios.add(new Usuario(++id,"Ignacio", "Fernández","ignfdez@correo.es",
				"-34a34A34-", "Madrid",new Date(10,4,1965), "Hombre", 
				new ArrayList<String>(Arrays.asList("c++","Python", "Java"))));
	}

	public static void agregrarCliente(Usuario usuario) {
		usuario.setId(++id);
		listaUsuarios.add(usuario);
	}

	//Getter y setter
	public static ArrayList<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}
	public static void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
		UsuarioModelo.listaUsuarios = listaUsuarios;
	}
}
