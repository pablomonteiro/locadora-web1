package br.com.unifip.locadora;

public class Veiculo {
	
	private String nome;
	private String placa;
	private String renavan;
	private String marca;
	
	public Veiculo(String nome, String placa, String renavan, String marca) {
		this.nome = nome;
		this.placa = placa;
		this.renavan = renavan;
		this.marca = marca;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getRenavan() {
		return renavan;
	}
	public void setRenavan(String renavan) {
		this.renavan = renavan;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	

}
