package controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe sua m�dia: ");
		double media = entrada.nextDouble();
		
		if(media < 10) {
			if(media >= 7.0) {
				System.out.println("Aprovado!");
			} else if(media < 7 && media >= 4) {
				System.out.println("Em recupera��o!");
			} else {
				System.out.println("Reprovado :( ");
			}
		}else {
			System.out.println("Que? O�");
		}
		
		entrada.close();
	}

}