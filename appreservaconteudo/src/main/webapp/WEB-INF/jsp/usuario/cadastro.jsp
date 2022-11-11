<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Usu�rio</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class="container mt-3">
		<form action="/cep" class="form-inline" method="post">
			<div class="form-group">
				<label>CEP:</label>
				<input type="text" class="form-control" placeholder="Entre com seu cep" name="cep">
			</div>
			<button type="submit" class="btn btn-default">Buscar</button>
		</form>
		<h2>Usu�rio</h2>
		<form action="/usuario/incluir" method="post">
			<div class="form-group">
				<label>Nome:</label> 
				<input type="text" class="form-control" placeholder="Entre com seu nome" name="nome">
			</div>
			<div class="form-group">
				<label>E-mail:</label>
				<input type="email"	class="form-control" placeholder="Entre com seu email" name="email">
			</div>
			<div class="form-group">
				<label>Senha:</label>
				<input type="password" class="form-control" placeholder="Entre com sua senha" name="senha">
			</div>
			<c:import url="/WEB-INF/jsp/endereco.jsp"/>
			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>
</body>
</html>