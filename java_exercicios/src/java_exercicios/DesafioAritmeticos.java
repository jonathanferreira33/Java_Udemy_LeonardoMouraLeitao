package java_exercicios;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
//		int x = 2 * 6 - 7;
//		int y = (int) Math.pow(x, 3); // a saida do metodo Math.pow � um double, o que obriga o uso do (int)
//		System.out.println(y);
		
//		Desafio:
//		([6*(3+2)]�/3*2 - ((1-5)*(2-7)/2)�)3/10
		
		int numA = 6*(3+2); //numerador A
		int denA = 3*2;	// denominador A 
		int numA2 = (int) Math.pow(numA, 2);
		int a2b = numA2 / denA;

		
		int numDenB = (1-5)*(2-7)/2; //numerador e denominador B 
		int numDenB2 = (int) Math.pow(numDenB, 2);

		
		int superior = a2b - numDenB2; // superiorAB
		int superior3 = (int) Math.pow(superior, 3); 

		
		int inferior = (int) Math.pow(10, 3); //inferior
				
		int resultadoFinal = superior3 / inferior;
		System.out.println(resultadoFinal);
	}
}
