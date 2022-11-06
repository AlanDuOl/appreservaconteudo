<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Usuário</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class="container mt-3">
		<h2>Login</h2>
		<form action="/usuario/autenticar" method="post">
			<div class="form-group">
				<label>E-mail:</label>
				<input type="email"	class="form-control" placeholder="Entre com seu email" name="email">
			</div>
			<div class="form-group">
				<label>Senha:</label>
				<input type="password" class="form-control" placeholder="Entre com sua senha" name="senha">
			</div>
			<button type="submit" class="btn btn-default">Autenticar</button>
		</form>
	</div>
</body>
</html>