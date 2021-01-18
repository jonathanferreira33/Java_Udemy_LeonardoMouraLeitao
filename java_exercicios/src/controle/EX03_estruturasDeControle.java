package controle;

import java.util.Scanner;

//Criar um programa que receba duas notas parciais, calcular a média final.
//Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
//se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", caso contrário imprime no console "Reprovado"

public class EX03_estruturasDeControle {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double media = 0;
		int i = 0;
		
		while(i < 2) {
			System.out.println("Digite uma nota: ");
			double notas = entrada.nextDouble();
			if(notas >=0 && notas <= 10) {
				media += + notas / 2;
				i++;
			}
		}
			System.out.println("Sua média final é: " + media);
			if(media >= 7.0) System.out.println("Aprovado!");
			else if(media >= 4.0 && media < 7.0) System.out.println("Em recuperação!");
			else System.out.println("Reprovado!");
			
		entrada.close();
	}
	
}
