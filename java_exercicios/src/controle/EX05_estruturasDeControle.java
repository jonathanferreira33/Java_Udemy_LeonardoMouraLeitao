package controle;

import java.util.Scanner;

public class EX05_estruturasDeControle {
	
	public static void main(String[] args) {
			
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero e eu falo s� ou n�o um n�mero primo: ");
		int numero = entrada.nextInt();
		
		int contadorDivisores = 0;
		
		for (int i = 2; i < numero; i++) {
			if(numero % i == 0) {
				contadorDivisores++;
			}
		}
		
		System.out.println(contadorDivisores);
		
		switch(contadorDivisores) {
		case 0: System.out.println("N�mero digitado � n�mero primo"); break;
		default: System.out.println("N�mero digitado N�O � um n�mero primo");
		}

	
		entrada.close();
	}

}
