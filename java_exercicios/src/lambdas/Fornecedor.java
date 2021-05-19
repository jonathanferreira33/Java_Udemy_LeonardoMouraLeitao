package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	
	public static void main(String[] args) {
		
		Supplier<List<String>> umaLista =
				() -> Arrays.asList("Jonathan", "Jhouus", "J"); // () obrigat�rio pois n�o h� parametros
				
		System.out.println(umaLista.get());
	}

}
