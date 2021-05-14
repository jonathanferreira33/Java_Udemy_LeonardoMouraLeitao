package lambdas;

public class CaculoTeste2 {
	
	public static void main(String[] args) {
		
		Calculo calculo = (a, b) -> { //interface Calculo te apenas 1 metodo
			return a + b; // lambdas com corpo "{}" precisam obrigat�riamente do return
		}; 
		System.out.println(calculo.executar(2, 3)); // esperado 5
		
		calculo = (x, y) -> x * y; //ao omitir o corpo da fun��o o java entende que o resultado ser� o retorno
		System.out.println(calculo.executar(2, 3)); // esperado 6
		
		System.out.println(calculo.legal());
		System.out.println(Calculo.muitoLegal());
		
	}

}
