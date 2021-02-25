package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioForeach {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas notas vc deseja informar?");
		double[] notas= new double[entrada.nextInt()];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota " + (i+1) + ": ");
			notas[i] = entrada.nextDouble();
		}
		
		double total = 0;
		for(double soma: notas) {
			total += soma;
		}
		System.out.println(Arrays.toString(notas) );
		System.out.println("M�dia final: " + (total/notas.length));
		
		
		entrada.close();
	}

}