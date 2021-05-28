package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o código: ");
		int cod = entrada.nextInt();
				
		Connection conexao = FabricaConexao.getConexao();
		String delete = "DELETE FROM pessoas WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(delete);
		stmt.setInt(1, cod);
		if(stmt.executeUpdate() > 0) {
			System.out.println("Pessoa excluida com sucesso!");
		}else {
			System.out.println("Pessoa não encontrada ;(");
		}
		
		conexao.close();
		entrada.close();
		
	}

}
