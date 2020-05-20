package com.dred.struts.formularios.proyectos;

public class Color {

	private int rojo;
	private int verde;
	private int azul;
	
	public Color(int rojo, int verde, int azul) {
		this.rojo = rojo;
		this.verde = verde;
		this.azul = azul;
	}
	
	public String toHex() {
		String cadena="#";
		cadena += String.format("%02X", rojo);
		cadena += String.format("%02X", verde);
		cadena += String.format("%02X", azul);
		return cadena;
	}
	
	@Override
	public String toString() {
		return this.toHex();
	}
	
	public String toRGB() {
		return "rgb("+this.rojo+","+this.verde+","+this.azul+")";
	}
	
	public int getRojo() {
		return rojo;
	}
	public void setRojo(int rojo) {
		this.rojo = rojo;
	}
	public int getVerde() {
		return verde;
	}
	public void setVerde(int verde) {
		this.verde = verde;
	}
	public int getAzul() {
		return azul;
	}
	public void setAzul(int azul) {
		this.azul = azul;
	}
	
}
