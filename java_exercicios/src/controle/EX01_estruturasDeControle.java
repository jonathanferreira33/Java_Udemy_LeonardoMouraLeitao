package controle;

import java.util.Scanner;

public class EX01_estruturasDeControle {
	
	
	public static void main(String[] args) {
		
		// 1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = entrada.nextInt(); 
		
		if(numero >= 0 && numero <= 10) System.out.println("Positivo menor que 10");
		System.out.println((numero % 2 == 0) ? "número par" : "número ímpar"); 
		entrada.close();
		
	}

}
