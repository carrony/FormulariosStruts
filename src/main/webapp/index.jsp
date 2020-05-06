<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title></title>
</head>
<body>
	<h1>Bienvenido a nuestro sitio web!</h1>
	<h3> Registrate en nuestro sitio web</h3>
	<s:url action="ir_registro" var="linkRegistro"/>
	<a href="${linkRegistro}">Regístrate</a> 
</body>
</html>
