package controle;

import java.util.Scanner;

public class EX09_estruturasDeControle {
	
//	Crie um programa que recebe 10 valores e ao final imprima o maior n�mero.
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double numeroMaior = 0;
		
		for(int i= 0; i < 10; i++) {
			System.out.println("Digite um n�mero: ");
			double numero = entrada.nextDouble();
				if(numero > numeroMaior) {
					numeroMaior = numero;
				}
		}
		
		System.out.println("O maior n�mero digitado foi: " + numeroMaior);
		
		entrada.close();
	}

}