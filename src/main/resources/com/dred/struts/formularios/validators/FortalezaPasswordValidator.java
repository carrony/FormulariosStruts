package com.dred.struts.formularios.validators;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class FortalezaPasswordValidator extends FieldValidatorSupport {
	private String caracteresEspeciales;

	@Override
	public void validate(Object object) throws ValidationException {
		boolean hayLetras=false;
		boolean hayNumeros=false;
		boolean haySimbolos=false;
		
		String campo=getFieldName();
		String valor = (String) getFieldValue(campo, object);
		if (valor == null) return;
		
		for (int i=0; i<valor.length();i++) {
			char letra=valor.charAt(i);
			if (Character.isLetter(letra)) hayLetras=true;
			if (Character.isDigit(letra)) hayNumeros=true;
			if (caracteresEspeciales!=null && caracteresEspeciales.indexOf(letra)>0) haySimbolos=true;
		}
		
		if(!hayLetras || !hayNumeros || !haySimbolos) {
			addFieldError(campo, object);
		}
	}

	public String getCaracteresEspeciales() {
		return caracteresEspeciales;
	}

	public void setCaracteresEspeciales(String caracteresEspeciales) {
		this.caracteresEspeciales = caracteresEspeciales;
	}

}
