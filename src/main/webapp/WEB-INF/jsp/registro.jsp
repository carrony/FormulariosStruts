<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<s:include value="inicio.jsp">
     <s:param name="titulo"> Listado de Productos</s:param>
</s:include>

	<h2>Registro</h2>
	<s:if test="hasActionErrors()">
	   <div class="errors">
	      <s:actionerror/>
	   </div>
	</s:if>
	<div id="form">
		<s:form action="crear_usuario">
			<s:textfield label="Nombre" name="usuario.nombre"/>
			<s:textfield label="Apellidos" name="usuario.apellidos"/>
			<s:textfield label="Correo electrónico" name="usuario.email"/>
			<s:password label="Contraseña" name="usuario.password"/>
			<s:password label="Repetir Contraseña" name="rePassword"/>
			<s:textfield label="Fecha nacimiento" name="usuario.fechaNac" type="date" format="dd-MM-yyyy"/>
			<s:radio label="Género" name="usuario.genero" list="{'Hombre','Mujer','Otro'}"/>
		  	<s:select label="Provincia" list="#session.provincias" listKey="codigo" listValue="nombre" name="usuario.provincia"></s:select>
			<s:checkboxlist list="{'C++','Java', 'PHP', 'Python'}" name="usuario.lenguajes"/>
			<s:submit value="Registrar"/>
		</s:form>
	</div>
	
<s:include value="fin.jsp"/>