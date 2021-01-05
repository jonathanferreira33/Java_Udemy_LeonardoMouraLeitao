package java_exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite seu antepenúltimo salário: ");
	String valor01 = entrada.next().replace(",", ".");
	
	System.out.println("Digite seu penúltimo salário: ");
	String valor02 = entrada.next().replace(",", ".");
			
	System.out.println("Digite seu último salário: ");
	String valor03 = entrada.next().replace(",", ".");
	
	double salario1 = Double.parseDouble(valor01);
	double salario2 = Double.parseDouble(valor02);
	double salario3 = Double.parseDouble(valor03);
	
	double media = (salario1 + salario2 + salario3) / 3;
	
	System.out.println("Sua média nos últimos 3 meses foi: R$ "+ media);
	entrada.close();
	
	}
	
}
