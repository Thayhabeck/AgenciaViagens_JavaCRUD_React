package br.com.crud.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	public static Connection createConnectionSQLServer() throws Exception {
		// Faz com que a classe seja carregada pela JVM
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
		
		// Cria a conexao com o banco de dados ----------------------- SEM senha
		Connection connection = DriverManager.getConnection(
			"jdbc:sqlserver://localhost;integratedSecurity=true;databaseName=HabeckTurismo;");

		return connection;
	}
	public static void main(String[] args) throws Exception{
		// Recupera uma conexao com o banco de dados
		Connection con = createConnectionSQLServer();
		// Testa se a conexao n nula
		if (con != null) {
			System.out.println("Conexão obtida com sucesso! " + con);
			con.close();
		}
	}

}
