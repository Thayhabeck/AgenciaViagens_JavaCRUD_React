package br.com.crud.teste;

import br.com.crud.dao.ClientesDAO;
import br.com.crud.model.Cliente;

public class ClientesTeste {

	public static void main(String[] args) {
		ClientesDAO clientesDAO = new ClientesDAO();
		
		// ------------ Cria um cliente e salva no banco
		//Cliente cli = new Cliente();
		//cli.setNome("Joaquim");
		//cli.setCpf("444.555.999-88");
		//cli.setEndereco("Rua das flores");
		
		// clientesDAO.save(cli);
		
		// ------------ Atualiza o cliente com id = 1 com os dados do objeto cli1
		//Cliente cli1 = new Cliente();
		//cli1.setId_Cli(1);
		//cli1.setNome("Francisco");
		//cli1.setCpf("444.555.111-88");
		//cli1.setEndereco("Rua das dores");
		
		//clientesDAO.update(cli1);
		
		// ------------ Remove o cliente com id
		// clientesDAO.removeById(1);
		
		// ------------ Lista todos os clientes do banco de dados
		for (Cliente c : clientesDAO.getClientes()) {
			System.out.printf("Nome: %s, CPF: %s, Endereço: %s\n", c.getNome(), c.getCpf(), c.getEndereco());
		}

	}

}
