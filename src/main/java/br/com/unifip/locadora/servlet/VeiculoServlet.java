package br.com.unifip.locadora.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import br.com.unifip.locadora.Veiculo;
import br.com.unifip.locadora.service.VeiculoService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VeiculoServlet
 */
@WebServlet("/veiculo")
public class VeiculoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	private VeiculoService service = new VeiculoService();
	
    /**
     * Default constructor. 
     */
    public VeiculoServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		if("novo".equals(acao)) {
			request.getRequestDispatcher("/jsp/veiculo/novo.jsp").forward(request, response);
		} else if("lista".equals(acao)) {
			List<Veiculo> veiculos = service.buscaTodos();
			request.setAttribute("listaDeVeiculos", veiculos);
			request.getRequestDispatcher("/jsp/veiculo/lista.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nomeVeiculo");
		String placa = request.getParameter("placaVeiculo");
		String renavan = request.getParameter("renavanVeiculo");
		String marca = request.getParameter("marcaVeiculo");
		service.grava(new Veiculo(nome, placa, renavan, marca));
		System.out.println("cadastrar veículo: nome:" + nome + ", placa: " + placa + ", renavan: " + renavan +", marca:" + marca);
	}

}
