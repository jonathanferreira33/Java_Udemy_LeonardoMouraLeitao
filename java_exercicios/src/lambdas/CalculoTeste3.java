package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	
	
	// int -> Double (não permite conversão do tipo Int para Double tipo classe) ex:
	//Double j = 1; //
	// double -> Double
	Double j = 1.0;
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> calculo = (a, b) -> { 
			return a + b; 
		}; 
		System.out.println(calculo.apply(2.0, 3.0));
		
		calculo = (x, y) -> x * y; 
		System.out.println(calculo.apply(2.0, 3.0)); 
		
		
		BinaryOperator<Integer> calculo2 = (a, b) -> { 
			return a + b; 
		}; 
		System.out.println(calculo2.apply(2, 3));
		
		calculo = (x, y) -> x * y; 
		System.out.println(calculo2.apply(2, 3)); 
		
	}

}
