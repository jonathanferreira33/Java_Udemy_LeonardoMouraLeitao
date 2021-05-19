package lambdas;

import java.util.Arrays;
import java.util.List;



public class Foreach {
	
	public static void main(String[] args) {
		List<String> aprovados = Arrays
				.asList("Mayara", "Liszandra", "Alline");
		
		System.out.println("Forma tradicional...");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		
		System.out.println("\nlambda #01...");
		aprovados.forEach(nome ->  System.out.println(nome + " !")); // Forma para parametro unico e unica sentça de cod 
		aprovados.forEach((nome) -> { System.out.println(nome + " !!");});
		
		
		System.out.println("\nMethod Reference #01...");
		aprovados.forEach(System.out::println);
		
		
		System.out.println("\nlambda #02...");
		aprovados.forEach(nome ->  meuImprimir(nome)); 
		
		
		System.out.println("\nMethod Reference #02...");
		aprovados.forEach(Foreach::meuImprimir);
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Olá, meu nome é " + nome);
	}

}
