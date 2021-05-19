package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = //entra inteiro e sai string
				numero -> numero % 2 == 0 ? "Par" : "Ímpar";
					
		System.out.println(parOuImpar.apply(10)); // par
		System.out.println(parOuImpar.apply(11)); // ímpar
		
		
		Function<String, String> oResultadoE = // entra string e sai string
				valor -> "O resultado é: " + valor;
				
		Function<String, String> empolgado =
				valor -> valor + "!!!";
				
		Function<String, String> duvida =
				valor -> valor + "?";
				
		String resultadoFinal = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(10);
		System.out.println(resultadoFinal);//par
		
		String resultadoFinal2 = parOuImpar
				.andThen(oResultadoE)
				.andThen(duvida)
				.apply(0);
		System.out.println(resultadoFinal2);
	}
}
