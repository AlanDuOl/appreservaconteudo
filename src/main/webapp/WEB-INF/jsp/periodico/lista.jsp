<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Periodicos</title>
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
					<th scope="col">Nome</th>
					<th scope="col">Edição</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="periodico" items="${periodicos}">
					<tr>
						<td>${periodico.GetId()}</td>
						<td>${periodico.GetTitulo()}</td>
						<td>${periodico.GetNome()}</td>
						<td>${periodico.GetEdicao()}</td>
						<td><a href="/periodico/${periodico.GetId()}/excluir">Excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>