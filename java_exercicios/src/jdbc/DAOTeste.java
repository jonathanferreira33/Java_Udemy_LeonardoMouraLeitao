package jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		DAO dao = new DAO();
		
		
		String sql = "INSERT INTO pessoas(nome) VALUES (?)";
		dao.incluir(sql, "Jonathan Ferreira");
		dao.incluir(sql, "J Ferreira");
		dao.incluir(sql, "JonJon Ferreira");
		dao.incluir(sql, "Jhon Ferreira");
		System.out.println(dao.incluir(sql, "Sharon")); // para imprimir o id criado
		
		
		String sql2 = "INSERT INTO pessoas(nome, codigo) VALUES (?, ?)";
		dao.incluir(sql2, "Elisa Maria", 10);
		
		
		dao.close(); // Para garantir que a conexao foi fechada
	}

}
