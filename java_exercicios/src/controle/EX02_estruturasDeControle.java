package controle;

import java.util.Scanner;

public class EX02_estruturasDeControle {
	
	//Criar um programa informa se o ano atual é um ano bissexto;
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um determinado ano e irei responder se é bissexto ou não: ");
		int ano = entrada.nextInt();
		
		String anoNaoBissexto = "Ano não bissexto!";
		String anoBissexto = "Ano bissexto(tem 366 dias)";
		
		if(ano % 4 == 0) { 
			if(ano % 100 == 0) {
				if(ano % 400 == 0 ) {
					System.out.println(anoBissexto);
				}else {
					System.out.println(anoNaoBissexto);
				}
			}else{
				System.out.println(anoBissexto);
			}
		} else {
			System.out.println(anoNaoBissexto);
		} 
		
		entrada.close();
		
	}
	
}
