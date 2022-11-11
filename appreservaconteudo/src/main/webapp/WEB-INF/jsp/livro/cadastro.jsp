<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Livros</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class="container mt-3">
		<h2>Livro</h2>
		<form action="/livro/cadastrar" method="post">
			<div class="form-group">
				<label>Titulo:</label> 
				<input type="text" class="form-control" placeholder="Entre com o título" name="titulo">
			</div>
			<div class="form-group">
				<label>Data Publicação:</label>
				<input type="date"	class="form-control" name="dataPublicacao">
			</div>
			<div class="form-group">
				<label>Autor:</label>
				<input type="text" class="form-control" placeholder="Entre com o autor" name="autor">
			</div>
			<div class="form-group">
				<label>Editora:</label>
				<input type="text" class="form-control" placeholder="Entre com a editora" name="editora">
			</div>
			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>
</body>
</html>