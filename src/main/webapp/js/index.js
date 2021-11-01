$(document).ready(function() {
	
	$("#btnNovoVeiculo").click(function() {
		location.href = "/veiculo?acao=novo";
	});
	
	$("#btnListaVeiculo").click(function() {
		location.href = "/veiculo?acao=lista";	
	});
	
});