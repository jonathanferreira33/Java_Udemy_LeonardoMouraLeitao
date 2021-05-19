package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int resultado1 = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(2);
		System.out.println(resultado1); //64
		
		int resultado2 = aoQuadrado
				.compose(vezesDois) // a diferen�a entre andThen e Compose � o sentido das opera��es
				.compose(maisDois) //  enquanto o andThen calcula de da primeira a �ltima instru��o  
				.apply(2);	//		   o compose vai da �ltima p/ a primeira			
		System.out.println(resultado2); //64
	}
	
}
