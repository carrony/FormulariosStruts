<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

	<s:include value="inicio.jsp">
	     <s:param name="titulo"> Proyecto creado</s:param>
	</s:include>
	<h2>Se ha creado el proyecto.</h2>
	<h3 style="background-color:<s:property value='proyecto.color'/>" class="color">
	    Proyecto: <s:property value="proyecto.nombre"/><br>
	 	<s:property value="proyecto.color"/>
	 	<br>
	 	<s:property value="proyecto.color.toRGB"/>
	 </h3>
	    

	
	<a href="<s:url action='index'/>">Volver al Inicio</a>
	
<s:include value="fin.jsp"/>