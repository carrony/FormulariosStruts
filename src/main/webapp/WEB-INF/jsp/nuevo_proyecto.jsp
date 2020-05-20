<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<s:include value="inicio.jsp">
     <s:param name="titulo"> Crea un nuevo proyecto</s:param>
</s:include>

	<h2>Proyecto Nuevo</h2>
	<div id="form">
		<p>El color se deberá especificar como color web. Ej #04e2cb</p>
		<s:form action="crear_proyecto">
			<s:textfield label="Nombre Proyecto" name="proyecto.nombre"/>
			
			<s:textfield label="Color" name="proyecto.color"/>
			<s:submit value="Crear Proyecto"/>
		</s:form>
	</div>
	
<s:include value="fin.jsp"/>