<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<s:include value="inicio.jsp">
     <s:param name="titulo"> Registro de Usuarios</s:param>
</s:include>

	<h2>Registro de Usuarios</h2>
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
			<s:radio label="Género" name="usuario.genero" list="{'Hombre','Mujer','Otro'}" value="'Hombre'"/>	
		  	<s:select label="Provincia" list="#session.provincias" listKey="codigo" listValue="nombre" name="usuario.provincia"></s:select>
			<s:checkboxlist list="{'C++','Java', 'PHP', 'Python'}" name="usuario.lenguajes"/>
			<s:submit value="Registrar"/>
		</s:form>
	</div>
	
	<h3>Listado de usuarios</h3>
<table class="listaDetalles">
		<tr>
			<th>Id</th>
			<th>Nombre</th>
			<th>Apellidos</th>
			<th>Email</th>
			<th>Fecha Nac.</th>
			<th>Género</th>
			<th>Provincia</th>
			<th>Lenguajes</th>
			<th>Acciones</th>
		</tr>
		<s:iterator value="listaUsuarios" var="p">
			<tr>
				<td><s:property value="#p.id"/></td>
				<td><s:property value="#p.nombre"/></td>
				<td><s:property value="#p.apellidos"/></td>
				<td><s:property value="#p.email"/></td>
				<td><s:date name="#p.fechaNac" format="dd-MM-yyyy"/></td>
				<td><s:property value="#p.genero"/></td>
				<td><s:property value="#p.provincia"/></td>
				<td><s:iterator value="#p.lenguajes">
					<s:property/><br>
				</s:iterator></td>
				<s:url action="editar_usuario" var="linkEditar">
					<s:param name="idUsuario" value="#p.id"/>
				</s:url>
				<s:url action="eliminar_usuario" var="linkEliminar">
					<s:param name="idUsuario" value="#p.id"/>
				</s:url>
				<td>
				<a href="${linkEditar}"><i class="fas fa-user-edit"></i></a> 
				<a href="${linkEliminar}"><i class="fas fa-user-times"></i></a>
				</td>
				
			</tr>
		</s:iterator>
	</table>
	
<s:include value="fin.jsp"/>