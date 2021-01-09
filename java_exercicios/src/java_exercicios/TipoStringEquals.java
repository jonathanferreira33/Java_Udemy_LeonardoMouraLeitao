package java_exercicios;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		String s1 = new String("2");
		System.out.println("2" == s1); // false, fois h� compara��es internas da linguagem
		
		
		String s2 = new String("3");
		System.out.println("3".equals(s2)); // true, pois o equals est� comparando apenas os conteudos
		
		Scanner entrada = new Scanner(System.in);
		
		String s3 = entrada.next(); // caso utilizar nextLine, h� necessidade do .trim(), .next() retira os espa�os em brancos
		System.out.println("4" == s3.trim()); // .trim() retira os espa�os em branco
		
		
		entrada.close();
	}

}
