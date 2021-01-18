package controle;

import java.util.Scanner;

public class While {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		String resp = "";
		
		while( !resp.equalsIgnoreCase("sair") ) {
			System.out.println("Digite uma palavra: ");
			resp = entrada.nextLine();
		}
		
		entrada.close();
	}

}
