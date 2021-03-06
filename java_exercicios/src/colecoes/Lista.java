package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	
	public static void main(String[] args) {
		List<Usuario> lista = new ArrayList<>(); // pode ser hetero e homogeneo / aceita duplicados / � ordenado / � indexado
		
		Usuario u1 = new Usuario("Jon");
		lista.add(u1);
		lista.add(new Usuario("Jonathan"));
		lista.add(new Usuario("Ferreira"));
		lista.add(new Usuario("Jhouus"));
		lista.add(new Usuario("J"));
		lista.add(new Usuario("J"));
		
		System.out.println(lista.get(3));
		
		lista.remove(1);
		System.out.println(lista.remove(new Usuario("Jon"))); // removedo devido o equals
		
		System.out.println(lista.contains(new Usuario("J")));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		
	}

}
