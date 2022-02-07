package br.com.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.crud.factory.ConnectionFactory;
import br.com.crud.model.Cliente;

public class ClientesDAO {
	
	public void save(Cliente cliente) {
		/*
		 * Isso é uma sql comum, os ? sao os parametros que nós vamos adicionar na base
		 * de dados
		 */

		String sql = "INSERT INTO Clientes (Nome, cpf, endereco)" + "VALUES(?,?,?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Cria uma conexao com o banco
			conn = ConnectionFactory.createConnectionSQLServer();

			// Cria um PreparedStatement, classe usada para executar a query
			pstm = conn.prepareStatement(sql);

			// Adicionar o valor do primeiro parametro da sql
			pstm.setString(1, cliente.getNome());

			// Adicionar o valor do segundo parametro da sql
			pstm.setString(2, cliente.getCpf());
			
			// Adicionar o valor do terceiro parametro da sql
			pstm.setString(3, cliente.getEndereco());

			// Executar a sql para insercao dos dados
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// fecha as conexoes
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void removeById(int id) {
		String sql = "DELETE FROM Clientes WHERE Id_C = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionFactory.createConnectionSQLServer();

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			pstm.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}

				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void update(Cliente cliente) {
		String sql = "UPDATE Clientes SET Nome = ?, cpf = ?, endereco = ? WHERE Id_C = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Cria uma conexao com o banco
			conn = ConnectionFactory.createConnectionSQLServer();

			// Cria um PreparedStatement, classe usada para executar a query
			pstm = conn.prepareStatement(sql);

			// Adicionar o valor do primeiro parametro da sql
			pstm.setString(1, cliente.getNome());

			// Adicionar o valor do segundo parametro da sql
			pstm.setString(2, cliente.getCpf());
			
			// Adicionar o valor do terceiro parametro da sql
			pstm.setString(3, cliente.getEndereco());

			// Adicionar o valor do terceiro parametro da sql
			pstm.setInt(4, cliente.getId_Cli());


			// Executa a sql para insersao dos dados
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Fecha as conexoes
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public List<Cliente> getClientes() {

		String sql = "SELECT * FROM Clientes";

		List<Cliente> clientes = new ArrayList<Cliente>();

		Connection conn = null;
		PreparedStatement pstm = null;

		// Classe que vai recuperar os dados do banco de dados
		ResultSet rset = null;

		try {
			conn = ConnectionFactory.createConnectionSQLServer();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			// Enquanto existir dados no banco de dados, faca
			while (rset.next()) {
				Cliente cliente = new Cliente();

				// Recupera o id do banco e atribui ele ao objeto
				cliente.setId_Cli(rset.getInt("Id_C"));

				// Recupera  do banco e atribui ele ao objeto
				cliente.setNome(rset.getString("nome"));

				// Recupera  do banco e atribui ele ao objeto
				cliente.setCpf(rset.getString("cpf"));
				
				// Recupera  do banco e atribui ele ao objeto
				cliente.setEndereco(rset.getString("endereco"));

				// Adiciona o contato recuperado, a lista de contatos
				clientes.add(cliente);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return clientes;
	}

}
