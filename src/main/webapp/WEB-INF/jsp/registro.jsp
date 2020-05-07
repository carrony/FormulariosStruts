<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de registro</title>
<link rel="stylesheet" href="/css/estilos.css">
</head>
<body>
	<h2>Registro</h2>
	<div id="form">
		<s:form action="crear_usuario">
		<s:textfield label="Nombre" name="usuario.nombre"/>
		<s:textfield label="Apellidos" name="usuario.apellidos"/>
		<s:textfield label="Correo electrónico" name="usuario.email"/>
		<s:password label="Contraseña" name="usuario.password"/>
		<s:textfield label="Fecha nacimiento" name="usuario.fechaNac" type="date" format="dd-MM-yyyy"/>
		<s:radio label="Género" name="usuario.genero" list="{'Hombre','Mujer','Otro'}"/>
		<s:select label="Provincia" list="provincias" listKey="codigo" listValue="nombre" name="usuario.provincia"></s:select>
		<s:checkboxlist list="{'C++','Java', 'PHP', 'Python'}" name="usuario.lenguajes"/>
		<s:submit value="Registrar"/>
	</s:form>
	</div>

</body>
</html>