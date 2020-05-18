<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

	<s:include value="inicio.jsp">
	     <s:param name="titulo"> Resumen del registro</s:param>
	</s:include>
	<h2>Enhorabuena!. Se ha registrado en la web correctamente.</h2>
	<h3>Los detealles de registro</h3>
	
	<table class="detalles">
		<tr><th> Nombre: </th><td><s:property value="usuario.nombre"/></td></tr>
		<tr><th> Apellidos:</th> <td><s:property value="usuario.apellidos"/></td></tr>
		<tr><th> Nombre: </th><td><s:property value="usuario.email"/></td></tr>
		<tr><th> Contraseña: </th><td><s:property value="usuario.password"/></td></tr>
		<tr><th> Fecha Nac: </th><td><s:property value="usuario.fechaNac"/></td></tr>
		<tr><th> Género: </th><td><s:property value="usuario.genero"/></td></tr><tr>
		<tr><th> Provincia: </th><td><s:property value="usuario.provincia"/></td></tr>
		<tr><th> Lenguajes: </th><td><ul>
		<s:iterator value="usuario.lenguajes">
			<li><s:property/></li>
		</s:iterator></ul></td></tr>
		
	</table>
	<a href="<s:url action='index'/>">Volver al Inicio</a>
	
<s:include value="fin.jsp"/>