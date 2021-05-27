package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	
	public static void main(String[] args) throws SQLException {
		
		final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		final String usuario = "root";
		final String senha = "admin123";
		
		Connection conexao = DriverManager
				.getConnection(url, usuario, senha);
		System.out.println("Conectado com sucesso!");
		conexao.close();
	}

}
