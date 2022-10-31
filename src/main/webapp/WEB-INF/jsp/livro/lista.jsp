<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Livros</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container mt-3">
		<table class="table">
			<thead>
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Titulo</th>
					<th scope="col">Autor</th>
					<th scope="col">Editora</th>
					<th scope="col">Data de publica��o</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="livro" items="${livros}">
					<tr>
						<td>${livro.GetId()}</td>
						<td>${livro.GetTitulo()}</td>
						<td>${livro.GetAutor()}</td>
						<td>${livro.GetEditora()}</td>
						<td>${livro.GetDataPublicacao()}</td>
						<td><a href="/livro/${livro.GetId()}/excluir">Excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>