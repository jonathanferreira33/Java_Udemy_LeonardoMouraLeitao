package controle;

import java.util.Random;
import java.util.Scanner;

public class EX06_estruturasDeControle {

//	Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
//	Armazene um numero aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar
//	o número gerado. Ao final de cada tentativa, imprima a quantidade de tentativas restantes,
//	e imprima se o número inserido é maior ou menor do que o número armazenado.
	
	public static void main(String[] args) {
		
		
		
		Scanner entrada = new Scanner(System.in);
		 Random random = new Random();        
         int numero = random.nextInt(100);    
//         System.out.println(numero);
         
         System.out.println("Jogo da adivinhação");

         for(int i = 1; i <= 10; i++) {
 			System.out.println("Digite um número inteiro entre 1 e 100 e nós falaremos se vc acertou!");
 			int resposta = entrada.nextInt();
 			
	 			if(resposta == numero) {
	 				System.out.println("Parabens vc acertou!");
	 				i+=10;
	 			}
	 			else if(resposta > numero) System.out.println("Número inserido MAIOR que o resultado correto!");
	 			else if(resposta < numero) System.out.println("Número inserido MENOR que o resultado correto!");
 				
 			System.out.println("Tentativas restantes: " + (10 - i)); 
         }
         
         System.out.println("Não foi dessa vez ;( numero correto: " + numero);
         
         

		entrada.close();
	}

}
