package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtualizarPorID {
	
	public static void main(String[] args) throws SQLException {
		
		Connection conexao = FabricaConexao.getConexao();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe cod da pessoa que deseja alterar: ");
		int codigo = entrada.nextInt();
		
		String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
		String update = "UPDATE pessoas SET nome = ? WHERE codigo = ? ";
		
		
		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, codigo);
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));
			System.out.println("Nome atual: " + p.getNome());
			entrada.nextLine();
			
			System.out.println("Informe o novo nome: ");
			String nomeAtual = entrada.nextLine();
			
			stmt.close();
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, nomeAtual);
			stmt.setInt(2, codigo);
			stmt.execute();
			stmt.close();
			System.out.println("Pessoa alterada com sucesso!");
			
		} else {
			System.out.println("Pessoa não encontrada!");
		}
		
		
			conexao.close();
			entrada.close();
		}

}
