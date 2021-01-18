package controle;

import java.util.Scanner;

public class Elseif {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
		System.out.print("Digite sua média: ");
		
		double nota = entrada.nextDouble();
		
		
		if(nota > 10 && nota < 0) {
			System.out.println("Nota inválida");	
		} else {
			if(nota >= 9) {
				System.out.println("Nota A");
			} else if(nota < 9 && nota >=8) {
				System.out.println("Nota B");
			}else if(nota < 8 && nota >=6) {
				System.out.println("Nota C");
			}else if(nota < 6 && nota >=3) {
				System.out.println("Nota D");
			}else {
				System.out.println("Nota E");
			}
		}
		
		
		entrada.close();
	}
	
	
	

}
