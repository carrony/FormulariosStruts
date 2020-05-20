package com.dred.struts.formularios.conversores;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.dred.struts.formularios.proyectos.Color;
import com.opensymphony.xwork2.conversion.TypeConversionException;

public class ColorConverter extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		boolean ok = true;
		Color c=null;
		if (values[0].charAt(0)!='#' || values[0].length()!=7) {
			ok=false;
		} else {
		// Tomamos los colores en hexadecimal
			String rojoTxt=values[0].substring(1,3);
			String verdeTxt=values[0].substring(3,5);
			String azulTxt=values[0].substring(5,7);
			
			int rojo=0,verde=0,azul=0;
			try {
				rojo=Integer.parseInt(rojoTxt,16);
				verde=Integer.parseInt(verdeTxt,16);
				azul=Integer.parseInt(azulTxt,16);
				c= new Color(rojo,verde,azul);
			} catch (NumberFormatException e) {
				ok=false;
			}
		}
		if (!ok) {
			throw new TypeConversionException("Color incorrecto");
		}

		return c;
	}

	@Override
	public String convertToString(Map context, Object o) {
		Color c = (Color) o;
		return c.toHex();
	}

}
