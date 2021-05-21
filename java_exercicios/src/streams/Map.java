package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	
	public static void main(String[] args) {
		
		Consumer<Object> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Mini " );
		
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
				
		System.out.println(Utilitarios.minuscula.andThen(Utilitarios.primeiraLetra).andThen(Utilitarios::grito).apply("Gool"));
		
		System.out.println("Utilizando composição: ");
		marcas.stream()
			.map(Utilitarios.minuscula) //lambda expressions
			.map(primeiraLetra)
			.map(Utilitarios::grito) //classe
			.forEach(print);
		
	}

}
