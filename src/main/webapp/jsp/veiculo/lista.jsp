<%@page import="java.util.ArrayList"%>
<%@page import="br.com.unifip.locadora.Veiculo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="/css/bootstrap.min.css">
		
		<meta charset="UTF-8">
		<title>Locadora - Lista Veículos</title>
	</head>
	<body>
		<div class="container">
			<div class="page-header">
				<h1 class="text-center">Veículo</h1>
			</div>
			<div class="page-body">
				<table class="table">
					<thead>
						<tr>
							<th>Nome</t>
							<th>Placa</th>
							<th>Renavan</th>
							<th>Marca</th>
						</tr>
					</thead>
					<tbody>
						<%
							List<Veiculo> veiculos = new ArrayList<>();
							
							if(request.getAttribute("listaDeVeiculos") != null) {
								veiculos = (List<Veiculo>) request.getAttribute("listaDeVeiculos");
							}
							
							for(Veiculo veiculo : veiculos) {
						%>
									<tr>
										<td><%= veiculo.getNome() %></td>
										<td><%= veiculo.getPlaca() %></td>
										<td><%= veiculo.getRenavan() %></td>
										<td><%= veiculo.getMarca() %></td>
									</tr>
						<%

							}
						%>
					</tbody>
				</table>
			</div>
			<a href="/">Voltar</a>
		</div>
	</body>
</html>