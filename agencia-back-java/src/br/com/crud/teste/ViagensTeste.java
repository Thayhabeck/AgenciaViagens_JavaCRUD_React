package br.com.crud.teste;

import br.com.crud.dao.ViagensDAO;
import br.com.crud.model.Viagem;

public class ViagensTeste {
	
	public static void main(String[] args) {

		ViagensDAO viagensDAO = new ViagensDAO();

		// ------------ Cria um destino e salva no banco
		// Viagem via = new Viagem();
		// via.setData_Ida("11/03/2022");
		// via.setData_Volta("22/03/2022");
		// via.setDiarias(11);
		// via.setId_Cli(1);
		// via.setId_Dest(1);

		// viagensDAO.save(via);

		// ------------ Atualiza o destino com id = 1 com os dados do objeto via1
		// Viagem via1 = new Viagem();
		// via1.setId(1);
		// via1.setData_Ida("08/03/2022");
		// via1.setData_Volta("22/03/2022");
		// via1.setDiarias(14);
		// via1.setId_Cli(1);
		// via1.setId_Dest(1);

		// viagensDAO.update(via1);

		// ------------ Remove o destino com id
		// viagensDAO.removeById(1);

		// ------------ Lista todos os clientes do banco de dados
		for (Viagem v : viagensDAO.getViagem()) {
			System.out.printf("Destino: %s, Cliente: %s, Ida: %s, Volta: %s, Total: R$%.2f\n", v.getDestino().getCidade(), v.getCliente().getNome(), v.getData_Ida(), v.getData_Volta(), (v.getDiarias() * v.getDestino().getPrecoDiaria()));
		}
	}

}
