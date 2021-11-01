<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="/css/bootstrap.min.css">
		<script type="text/javascript" src="/js/utils/jquery-3.6.0.min.js"></script>
		<script type="text/javascript" src="/js/novo.js"></script>
		
		<meta charset="UTF-8">
		<title>Locadora - Novo Veículo</title>
	</head>
	<body>
		<div class="container">
			<div class="page-header">
				<h1 class="text-center">Veículo</h1>
			</div>
			<div class="page-body">
				<form id="formNovoVeiculo">
					<div class="row">
						<div class="col-md-3">
							<input type="text" placeholder="Nome do Veículo" id="nomeVeiculo" name="nomeVeiculo"/>
						</div>
						<div class="col-md-3">
							<input type="text" placeholder="Placa do Veículo" id="placaVeiculo" name="placaVeiculo"/>
						</div>
						<div class="col-md-3">
							<input type="text" placeholder="Renavan do Veículo" id="renavanVeiculo" name="renavanVeiculo"/>
						</div>
						<div class="col-md-3">
							<input type="text" placeholder="Marca do Veículo" id="marcaVeiculo" name="marcaVeiculo"/>
						</div>
					</div>
					<div class="row">
						<input type="button" id="btnGravar" class="btn btn-primary" value="Gravar"/>
					</div>
				</form>
			</div>
		</div>
	</body>
</html>