package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		//Domingo =1
		//..
		//sabado = 7
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um dida da semana: ");
		String diaSemana = entrada.next();
		
		if(diaSemana.equalsIgnoreCase("domingo")) {
			System.out.println("1");
		}else if(diaSemana.equalsIgnoreCase("segunda") ) {
			System.out.println("2");
		}else if(diaSemana.equalsIgnoreCase("terça") || diaSemana.equalsIgnoreCase("terca") ) {
			System.out.println("3");
		}else if(diaSemana.equalsIgnoreCase("quarta") ) {
			System.out.println("4");
		}else if(diaSemana.equalsIgnoreCase("quinta") ) {
			System.out.println("5");
		}else if(diaSemana.equalsIgnoreCase("sexta") ) {
			System.out.println("6");
		}else if(diaSemana.equalsIgnoreCase("sábado") || diaSemana.equalsIgnoreCase("sabado") ) {
			System.out.println("7");
		}else {
			System.out.println("Dia inválido");
		}
		
		entrada.close();
	}
}
