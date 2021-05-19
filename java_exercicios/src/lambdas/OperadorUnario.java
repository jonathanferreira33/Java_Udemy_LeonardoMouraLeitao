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
				.compose(vezesDois) // a diferença entre andThen e Compose é o sentido das operações
				.compose(maisDois) //  enquanto o andThen calcula de da primeira a última instrução  
				.apply(2);	//		   o compose vai da última p/ a primeira			
		System.out.println(resultado2); //64
	}
	
}
