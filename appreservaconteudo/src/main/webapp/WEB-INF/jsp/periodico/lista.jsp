<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Periodicos</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
		<h4><a href="/periodico/cadastro">Cadastrar Periodico</a></h4>
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
						<td>${periodico.getId()}</td>
						<td>${periodico.getTitulo()}</td>
						<td>${periodico.getNome()}</td>
						<td>${periodico.getEdicao()}</td>
						<td><a href="/periodico/${periodico.getId()}/excluir">Excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>