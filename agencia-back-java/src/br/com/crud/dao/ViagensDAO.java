package br.com.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.crud.factory.ConnectionFactory;
import br.com.crud.model.Cliente;
import br.com.crud.model.Destino;
import br.com.crud.model.Viagem;

public class ViagensDAO {

	public void save(Viagem viagem) {


		String sql = "INSERT INTO Viagens (DataIda, DataVolta, Diarias, ClienteId, DestinoId)" + "VALUES(?,?,?,?,?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {

			conn = ConnectionFactory.createConnectionSQLServer();

			
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, viagem.getData_Ida());

			pstm.setString(2, viagem.getData_Volta());
			
			pstm.setInt(3, viagem.getDiarias());
			
			pstm.setInt(4, viagem.getId_Cli());
			
			pstm.setInt(5, viagem.getId_Dest());

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
	
	public void removeById(int id) {
		String sql = "DELETE FROM Viagens WHERE Id_V = ?";

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
	
	public void update(Viagem viagem) {
		String sql = "UPDATE Viagens SET DataIda = ?, DataVolta = ?, Diarias = ?, ClienteId = ?, DestinoId = ? WHERE Id_V = ? ";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {

			conn = ConnectionFactory.createConnectionSQLServer();


			pstm = conn.prepareStatement(sql);

			pstm.setString(1, viagem.getData_Ida());

			pstm.setString(2, viagem.getData_Volta());
			
			pstm.setInt(3, viagem.getDiarias());
			
			pstm.setInt(4, viagem.getId_Cli());
			
			pstm.setInt(5, viagem.getId_Dest());

			pstm.setInt(6, viagem.getId_Viag());

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
	
	public List<Viagem> getViagem() {

		String sql = "select v.Id_V, v.DataIda, v.DataVolta, v.Diarias, c.Id_C, c.Nome as Cliente, d.Id_D, d.Cidade as Destino, d.Estado, d.PrecoDiaria from Viagens as v inner join Clientes as c on v.ClienteId = c.Id_C inner join Destinos as d on v.DestinoId = d.Id_D";

		List<Viagem> viagens = new ArrayList<Viagem>();

		Connection conn = null;
		PreparedStatement pstm = null;

		// Classe que vai recuperar os dados do banco de dados
		ResultSet rset = null;

		try {
			conn = ConnectionFactory.createConnectionSQLServer();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();


			while (rset.next()) {
				Viagem viagem = new Viagem();
				Cliente cliente = new Cliente();
				Destino destino = new Destino();

				// Recupera o id do banco e atribui ele ao objeto
				viagem.setId_Viag(rset.getInt("Id_V"));

				// Recupera o nome do banco e atribui ele ao objeto
				viagem.setData_Ida(rset.getString("DataIda"));

				// Recupera a idade do banco e atribui ele ao objeto
				viagem.setData_Volta(rset.getString("DataVolta"));
				
				viagem.setDiarias(rset.getInt("Diarias"));
				
				cliente.setId_Cli(rset.getInt("Id_C"));
				
				cliente.setNome(rset.getString("Cliente"));
				
				viagem.setCliente(cliente);
				
				destino.setId_Dest(rset.getInt("Id_D"));
				
				destino.setCidade(rset.getString("Destino"));
				
				destino.setEstado(rset.getString("Estado"));
				
				destino.setPrecoDiaria(rset.getDouble("PrecoDiaria"));
				
				viagem.setDestino(destino);

				// Adiciona o contato recuperado, a lista de contatos
				viagens.add(viagem);
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
		return viagens;
	}
}
