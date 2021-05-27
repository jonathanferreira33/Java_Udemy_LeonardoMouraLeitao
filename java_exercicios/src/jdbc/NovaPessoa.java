package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		System.out.println("informe o nome: ");
		String nome = entrada.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		stmt.execute();
		
		
		// PARA + DE 1 VALOR
		System.out.println("informe o nome 2: ");
		String nome2 = entrada.nextLine();
		String sql2 = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)";
		PreparedStatement stmt2 = conexao.prepareStatement(sql2);
		stmt2.setString(1, nome2);
		stmt2.setInt(2, 100);
		stmt2.execute();
		
		
		System.out.println("Pessoa incluida com sucesso!");
		entrada.close();
	}

}
