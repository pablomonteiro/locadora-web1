
$(document).ready(function() {
	
	$("#btnGravar").click(function() {
		$.ajax({
			url:"http://localhost:8080/veiculo",
			data:$("#formNovoVeiculo").serialize(),
			type:"POST"
		}).done(function() {
			console.log("Ok")
		}).fail(function() {
			console.log("Erro")
		});
	});
	
});