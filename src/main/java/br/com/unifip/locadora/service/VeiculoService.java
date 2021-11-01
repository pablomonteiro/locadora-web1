package br.com.unifip.locadora.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.com.unifip.locadora.Veiculo;

public class VeiculoService {
	
	private Map<String, Veiculo> mapVeiculos = new HashMap<String, Veiculo>();
	
	public void grava(Veiculo veiculo) {
		mapVeiculos.put(veiculo.getNome(), veiculo);
	}
	
	public List<Veiculo> buscaTodos() {
		return mapVeiculos.values().stream().collect(Collectors.toList());
	}

}
