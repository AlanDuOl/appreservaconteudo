<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Reservas</title>
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
					<th scope="col">Descricao</th>
					<th scope="col">Data Reserva</th>
					<th scope="col">Aluno</th>
					<th scope="col">Conteudos Emprestados</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="reserva" items="${reservas}">
					<tr>
						<td>${reserva.GetId()}</td>
						<td>${reserva.GetDescricao()}</td>
						<td>${reserva.GetDataReserva()}</td>
						<td>${reserva.GetAluno().GetMatricula()}</td>
						<td>${reserva.GetConteudos().size()}</td>
						<td><a href="/reserva/${reserva.GetId()}/excluir">Excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>