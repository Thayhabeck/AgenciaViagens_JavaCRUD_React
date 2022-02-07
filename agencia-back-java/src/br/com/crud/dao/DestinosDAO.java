package br.com.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.crud.factory.ConnectionFactory;
import br.com.crud.model.Destino;

public class DestinosDAO {
	public void save(Destino destino) {
		/*
		 * Isso é uma sql comum, os ? sao os parametros que nós vamos adicionar na base
		 * de dados
		 */

		String sql = "INSERT INTO Destinos (Cidade, Estado, Descricao, PrecoDiaria, Url)" + "VALUES(?,?,?,?,?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Cria uma conexao com o banco
			conn = ConnectionFactory.createConnectionSQLServer();

			// Cria um PreparedStatement, classe usada para executar a query
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, destino.getCidade());

			pstm.setString(2, destino.getEstado());

			pstm.setString(3, destino.getDescricao());
			
			pstm.setDouble(4, destino.getPrecoDiaria());
			
			pstm.setString(5, destino.getUrl_img());

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
		String sql = "DELETE FROM Destinos WHERE Id_D = ?";

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
	
	public void update(Destino destino) {
		String sql = "UPDATE Destinos SET Cidade = ?, Estado = ?, Descricao = ?, PrecoDiaria = ?, Url = ? WHERE Id_D = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Cria uma conexao com o banco
			conn = ConnectionFactory.createConnectionSQLServer();

			// Cria um PreparedStatement, classe usada para executar a query
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, destino.getCidade());

			pstm.setString(2, destino.getEstado());

			pstm.setString(3, destino.getDescricao());
			
			pstm.setDouble(4, destino.getPrecoDiaria());
			
			pstm.setString(5, destino.getUrl_img());
			
			pstm.setInt(6, destino.getId_Dest());


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
	
	public List<Destino> getDestinos() {

		String sql = "SELECT * FROM Destinos";

		List<Destino> destinos = new ArrayList<Destino>();

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
				Destino destino = new Destino();

				destino.setId_Dest(rset.getInt("Id_D"));

				destino.setCidade(rset.getString("Cidade"));

				destino.setEstado(rset.getString("Estado"));

				destino.setDescricao(rset.getString("Descricao"));
				
				destino.setPrecoDiaria(rset.getDouble("PrecoDiaria"));
				
				destino.setUrl_img(rset.getString("url"));

				// Adiciona o contato recuperado, a lista de contatos
				destinos.add(destino);
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
		return destinos;
	}

}
