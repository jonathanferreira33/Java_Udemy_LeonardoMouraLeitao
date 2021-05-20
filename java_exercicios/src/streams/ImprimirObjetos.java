package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimirObjetos {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Jonathan", "Jon", "Jhouus", "J");
		
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		
		System.out.println("\n");
		
		//Foreach
		for (String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\n");
		
		//Iterator
		Iterator<String> it = aprovados.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\n");
		
		
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
	}

}
