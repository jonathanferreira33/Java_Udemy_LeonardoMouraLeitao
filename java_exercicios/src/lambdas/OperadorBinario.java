package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	
	public static void main(String[] args) {
		
		double notaA = 9.5;
		double notaB = 8.0;
		
		BinaryOperator<Double> media = 
				(n1, n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(notaA, notaB));
		
		//forma 1
		BiFunction<Double, Double, String> resultado =
				(n1, n2) -> ((n1 + n2) / 2) > 7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado.apply(notaA, notaB));
		
		//forma 2
		BiFunction<Double, Double, String> resultado2 =	(n1, n2) -> {
			double notaFinal = (n1 + n2) / 2;
			return notaFinal >= 7 ? "Aprovado" : "Reprovado";
		};
		System.out.println(resultado2.apply(notaA, notaB));
		
		
		Function<Double, String> conceito = 
				m -> m >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(media.andThen(conceito).apply(notaA, notaB));
	}

}
