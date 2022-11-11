<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="/">AppReservaConteudo</a>
		</div>
		<ul class="nav navbar-nav">
			<li class="nav-item"><a class="nav-link" href="/">Home</a></li>
			<c:if test="${not empty usuario}">
				<li class="nav-item"><a class="nav-link" href="/usuario/lista">Usuario</a></li>
				<li class="nav-item"><a class="nav-link" href="/reserva/lista">Reserva</a></li>
				<li class="nav-item"><a class="nav-link" href="/aluno/lista">Aluno</a></li>
				<li class="nav-item"><a class="nav-link" href="/didatico/lista">Didatico</a></li>
				<li class="nav-item"><a class="nav-link"
					href="/periodico/lista">Periodico</a></li>
				<li class="nav-item"><a class="nav-link" href="/livro/lista">Livro</a></li>
			</c:if>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<c:if test="${empty usuario}">
				<li><a href="/usuario/cadastro"><span
						class="glyphicon glyphicon-user"></span> Sign Up</a></li>
				<li><a href="/usuario/login"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>
			</c:if>
			<c:if test="${not empty usuario}">
				<li><a href="/usuario/logout"><span
						class="glyphicon glyphicon-log-out"></span> Logout</a></li>
			</c:if>
		</ul>
	</div>
</nav>