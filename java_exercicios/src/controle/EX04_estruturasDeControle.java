package controle;

import java.util.Scanner;

public class EX04_estruturasDeControle {

	// Criar um programa que receba um número e diga se ele é um número primo.
	
	public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite um número inteiro e eu respodo se é primo ou não : ");
			int numero = entrada.nextInt();
			
			if(numero >= -13 && numero <= 13 ) {
				if(numero == -13 || numero == -11 || numero == -7 || numero == -5 ||
						numero == -3 || numero == -2 || numero == -2 || numero == 3 ||
						numero == 5 || numero == 7 || numero == 11 || numero == 13) {
					System.out.println("Primo!");
				} else{
					System.out.println("Não primo");
				}
				
			} else {
				
				if(numero % 2 == 0) System.out.println("Não primo");
				else if(numero % 13 == 0) System.out.println("Não primo");
				else if(numero % 11 == 0) System.out.println("Não primo");
				else if(numero % 7 == 0) System.out.println("Não primo");
				else if(numero % 5 == 0) System.out.println("Não primo");
				else if(numero % 3 == 0) System.out.println("Não primo");
				else System.out.println("Primo");
			}
			
			entrada.close();
	}

}