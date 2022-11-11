<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Reservas</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class="container mt-3">
		<h2>Reserva</h2>
		<form action="/reserva/cadastrar" method="post">
			<div class="form-group">
				<label>Descricao:</label>
				<input type="text" class="form-control" placeholder="Entre com a descrição" name="descricao">
			</div>
			<div class="form-group">
				<label>Data Reserva:</label>
				<input type="datetime-local" class="form-control" name="dataReserva">
			</div>
			<div class="form-group">
				<label>Alunos:</label>
				<select name="aluno.id" class="form-select">
					<c:forEach var="a" items="${alunos}">
						<option value="${a.getId()}">${a.getNome()}</option>
					</c:forEach>
				</select>
			</div>
			<div class="form-group">
				<label>Conteúdos:</label>
				<c:forEach var="c" items="${conteudos}">
					<div class="form-check">
						<input class="form-check-input" type="checkbox" name="conteudos"
							value="${c.getId()}">
					<label class="form-check-label">${c.getTitulo()}</label>
					</div>
				</c:forEach>
			</div>
			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>
</body>
</html>