package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa"); //nome da unit persistence(arq.xml), assim ele encontra as infos para realizar a conexao com DB
		EntityManager em = emf.createEntityManager();
		
		Usuario novoUsuario = new Usuario("Excluir", "ex@email.com");
		
		
		
		em.getTransaction().begin();
		em.persist(novoUsuario); // met.para inserir obj no db
		em.getTransaction().commit();
		
		System.out.println("O ID gerado foi: " + novoUsuario.getId());
		
		em.close();
		emf.close();
	}

}
