package controle;

import java.util.Scanner;

public class EX07_estruturasDeControle {
	
//	Criar um programa que enquanto estiver recebendo números positivos,
//	imprime no console a soma dos números inseridos, caso receba um número negativo,
//	encerre o programa. Tente utilizar a estrutura do while.
	
	public static void main(String[] args) {
	
			
		Scanner entrada = new Scanner(System.in);
		
		int numero = 1;
		int somaNumeros = 0;
				
		while(numero > 0) {
			System.out.println("Digite um novo número: ");
			numero = entrada.nextInt();
			if(numero > 0) {
				somaNumeros += + numero;
				System.out.println("Soma dos numeros digitados até o momento: " + somaNumeros);				
			}
		}

		entrada.close();
		
		
	}
}
