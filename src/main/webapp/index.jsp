<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<s:include value="/WEB-INF/jsp/inicio.jsp">
     <s:param name="titulo"> Listado de Productos</s:param>
</s:include>
	<h1>Bienvenido a nuestro sitio web!</h1>
	<h3> Registra Usuarios</h3>
	<s:url action="ir_registro" var="linkRegistro"/>
	<a href="${linkRegistro}">Registrar Usuarios</a> 
	
	<h3> Crea un nuevo proyecto</h3>
	<s:url action="ir_nuevoProyecto" var="linkProyecto"/>
	<a href="${linkProyecto}">Crear Proyecto</a> 
	
<s:include value="/WEB-INF/jsp/fin.jsp"/>