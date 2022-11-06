<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Aluno</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class="container mt-3">
		<h2>Aluno</h2>
		<form action="/aluno/cadastrar" method="post">
			<div class="form-group">
				<label>Nome:</label> 
				<input type="text" class="form-control" placeholder="Entre com um nome" name="nome">
			</div>
			<div class="form-group">
				<label>E-mail:</label>
				<input type="email"	class="form-control" placeholder="Entre com um email" name="email">
			</div>
			<div class="form-group">
				<label>Matricula:</label> 
				<input type="text" class="form-control" placeholder="Entre com uma matrícula" name="matricula">
			</div>
			<div class="form-group">
				<label>Quantidade de conteúdos:</label>
				<input type="text" class="form-control" placeholder="Entre com a quantidade de conteúdos" name="quantidadeMaximaConteudosEmprestados">
			</div>
			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>
</body>
</html>