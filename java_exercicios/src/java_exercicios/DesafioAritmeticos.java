package java_exercicios;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
//		int x = 2 * 6 - 7;
//		int y = (int) Math.pow(x, 3); // a saida do metodo Math.pow � um double, o que obriga o uso do (int)
//		System.out.println(y);
		
//		Desafio:
//		([6*(3+2)]�/3*2 - ((1-5)*(2-7)/2)�)3/10
		
		int a = 6*(3+2); //numerador A
		int b = 3*2;	// denominador A 
		int a2 = (int) Math.pow(a, 2);
		int a2b = a2 / b;
//		System.out.println(a2b); // superiorA
		
		int c = (1-5)*(2-7)/2; //numerador e denominador B 
		int c2 = (int) Math.pow(c, 2);
//		System.out.println(c2); // superior B
		
		int d = a2b - c2; // superiorAB
		int e = (int) Math.pow(d, 3); 
//		System.out.println(e); // superiorAB3
		
		int f = (int) Math.pow(10, 3); //inferior
				
		int resultadoFinal = e / f;
		System.out.println(resultadoFinal);
	}
}
