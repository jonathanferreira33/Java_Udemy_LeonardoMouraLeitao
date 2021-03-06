package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
//		Set<String> ListaAprovados = new HashSet<String>(); //apos o HashSet � possivel colocar <> ao inves de <String>
		SortedSet<String> ListaAprovados = new TreeSet<>(); //Tree printa conforme inserido
		ListaAprovados.add("Jon");
		ListaAprovados.add("Jonathan");
		ListaAprovados.add("JonJon");
		ListaAprovados.add("Jhous");
		
		for(String candidato: ListaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(33);
		nums.add(10);
		
		for(int n: nums) {
			System.out.println(n);
		}
	}

}
