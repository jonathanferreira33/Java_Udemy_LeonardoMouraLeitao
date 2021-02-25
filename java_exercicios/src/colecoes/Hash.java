package colecoes;

import java.util.HashSet;

public class Hash {
	
	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("Jonathan"));
		usuarios.add(new Usuario("Jon"));
		usuarios.add(new Usuario("Jhouus"));
		
		boolean resultado = usuarios.contains(new Usuario("Jonathan"));
		System.out.println(resultado);
	
	}

}
