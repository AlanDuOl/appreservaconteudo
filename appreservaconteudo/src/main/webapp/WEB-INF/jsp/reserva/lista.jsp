<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Reservas</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
		<h4><a href="/reserva/cadastro">Cadastrar Reserva</a></h4>
		<table class="table">
			<thead>
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Descricao</th>
					<th scope="col">Data Reserva</th>
					<th scope="col">Matricula aluno</th>
					<th scope="col">Conteudos da reserva</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="reserva" items="${reservas}">
					<tr>
						<td>${reserva.getId()}</td>
						<td>${reserva.getDescricao()}</td>
						<td>${reserva.getDataReserva()}</td>
						<td>${reserva.getAluno().getMatricula()}</td>
						<td>${reserva.getConteudos().size()}</td>
						<td><a href="/reserva/${reserva.getId()}/excluir">Excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>