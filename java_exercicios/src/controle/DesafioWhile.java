package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Vamos calcular sua m�dia (ATEN��O: para sair digite -1)");
		int totalNotas = 0;
		double notaAtual = 0;
		double somaNotas = 0;
		while(notaAtual != -1) {
			System.out.println("Digite a pr�xima nota: ");
			notaAtual = entrada.nextDouble();
			
			if(notaAtual >= 0 && notaAtual <= 10) {				
			somaNotas += notaAtual;
			totalNotas++;
			}else if(notaAtual != -1) {
				System.out.println("Nota inv�lida, digite novamente");
			}
		}
		
		double media = somaNotas / totalNotas;
		
		System.out.println(somaNotas);
		System.out.println("Voc� digitou um total de: " + totalNotas + ", e sua m�dia foi: " + media);
		entrada.close();
	}

}