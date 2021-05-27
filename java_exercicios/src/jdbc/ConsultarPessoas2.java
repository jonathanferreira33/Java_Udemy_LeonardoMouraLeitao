package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
	
public static void main(String[] args) throws SQLException {
		
	// PESQUISA PESSOAS COM ENTRADA PARCIAL DO NOME
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("informe o nome para cunsultar DB: ");
		String pesquisa = entrada.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE nome like ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + pesquisa + "%");
		
		ResultSet resultado = stmt.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		for(Pessoa p: pessoas) {
			System.out.println(p.getCodigo() + "==>" + p.getNome());
		}
		
		stmt.close();
		conexao.close();
		entrada.close();
	}

}
