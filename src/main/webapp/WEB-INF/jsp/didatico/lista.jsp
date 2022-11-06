<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Didaticos</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
		<table class="table">
			<thead>
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Titulo</th>
					<th scope="col">Autor</th>
					<th scope="col">Data de Conclusão</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="didatico" items="${didaticos}">
					<tr>
						<td>${didatico.GetId()}</td>
						<td>${didatico.GetTitulo()}</td>
						<td>${didatico.GetDataConclusao()}</td>
						<td>${didatico.GetAutor()}</td>
						<td><a href="/didatico/${didatico.GetId()}/excluir">Excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>