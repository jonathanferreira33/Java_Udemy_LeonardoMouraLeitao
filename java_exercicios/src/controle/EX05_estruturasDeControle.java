package controle;

import java.util.Scanner;

public class EX05_estruturasDeControle {
	
	public static void main(String[] args) {
			
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número e eu falo sé ou não um número primo: ");
		int numero = entrada.nextInt();
		
		int contadorDivisores = 0;
		
		for (int i = 2; i < numero; i++) {
			if(numero % i == 0) {
				contadorDivisores++;
			}
		}
		
		System.out.println(contadorDivisores);
		
		switch(contadorDivisores) {
		case 0: System.out.println("Número digitado é número primo"); break;
		default: System.out.println("Número digitado NÃO é um número primo");
		}

	
		entrada.close();
	}

}
