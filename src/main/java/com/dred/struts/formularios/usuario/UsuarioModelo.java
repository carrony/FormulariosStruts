package com.dred.struts.formularios.usuario;

import java.time.LocalDate;
import java.time.ZoneId;
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
				"aA123456!", "41", asDate(LocalDate.of(1980,10,1)), "Mujer", 
				new ArrayList<String>(Arrays.asList("c++","Java"))));
		listaUsuarios.add(new Usuario(++id,"Juan", "López","jualpz@correo.es",
				"aI1y47O6!", "29",asDate(LocalDate.of(2000,10,1)), "Hombre", 
				new ArrayList<String>(Arrays.asList("c++"))));
		listaUsuarios.add(new Usuario(++id,"María", "Sánchez","msanchez@correo.es",
				"10AA10#b", "14",asDate(LocalDate.of(1995,01,21)), "Mujer", 
				new ArrayList<String>(Arrays.asList("c++","python"))));
		listaUsuarios.add(new Usuario(++id,"Ignacio", "Fernández","ignfdez@correo.es",
				"-34a34A34-", "21",asDate(LocalDate.of(1965,4,1)), "Hombre", 
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

	public static Usuario getUsuario(int idUsuario) {
		Usuario usuario = null;
		for (Usuario u : listaUsuarios) {
			if (u.getId()==idUsuario) {
				usuario=u;
			}
		}
		return usuario;
	}

	public static void editarUsuario(Usuario usuario) {
		// Lo recuperamos de la lista por el id y lo actualizamos
		Usuario u = getUsuario(usuario.getId());
		int pos= listaUsuarios.indexOf(u);
		listaUsuarios.set(pos, usuario);
		
	}

	public static void eliminarUsuario(int idUsuario) {
		Usuario u = getUsuario(idUsuario);
		listaUsuarios.remove(u);
	}
	
	public static Date asDate(LocalDate localDate) {
	    return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
	  }
}
