<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro Correcto</title>
<link rel="stylesheet" href="/css/estilos.css">
</head>
<body>
	<h2>Enhorabuena!. Se ha registrado en la web correctamente.</h2>
	<h3>Los detealles de regitro</h3>
	
	<table class="detalles">
		<tr><th> Nombre: </th><td><s:property value="usuario.nombre"/></td></tr>
		<tr><th> Apellidos:</th> <td><s:property value="usuario.apellidos"/></td></tr>
		<tr><th> Nombre: </th><td><s:property value="usuario.email"/></td></tr>
		<tr><th> Contraseña: </th><td><s:property value="usuario.password"/></td></tr>
		<tr><th> Fecha Nac: </th><td><s:property value="usuario.fechaNac"/></td></tr>
	</table>
	<a href="<s:url action='index'/>">Volver al Inicio</a>
</body>
</html>