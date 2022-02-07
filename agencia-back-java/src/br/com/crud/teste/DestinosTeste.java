package br.com.crud.teste;

import br.com.crud.dao.DestinosDAO;
import br.com.crud.model.Destino;

public class DestinosTeste {

	public static void main(String[] args) {

		DestinosDAO destinosDAO = new DestinosDAO();

		// ------------ Cria um destino e salva no banco
		// Destino dest = new Destino();
		// dest.setCidade("Recife");
		// dest.setEstado("PE");
		// dest.setDescricao("Cidade linda");
		// dest.setPrecoDiaria(150.15);
		// dest.setUrl_img("sem img");

		// destinosDAO.save(dest);

		// ------------ Atualiza o destino com id = 1 com os dados do objeto dest1
		// Destino dest1 = new Destino();
		// dest1.setId(1);
		// dest1.setCidade("Recife");
		// dest1.setEstado("PE");
		// dest1.setDescricao("Cidade linda");
		// dest1.setPrecoDiaria(150.15);
		// dest1.setUrl_img("sem img");

		// clientesDAO.update(dest1);

		// ------------ Remove o destino com id
		// destinosDAO.removeById(1);

		// ------------ Lista todos os clientes do banco de dados
		for (Destino d : destinosDAO.getDestinos()) {
			System.out.printf("Destino: %s - %s, Preço da diária: %.2f\n", d.getCidade(), d.getEstado(), d.getPrecoDiaria());
		}
	}
}
