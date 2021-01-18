package controle;

public class DesafioIf {

	public static void main(String[] args) {
		double nota = 1.3;
		
		if(nota >= 9.0); { // ; após o boolean do if está finalizando a sentença antes do esperado, não usar ; em estrutura de controle (há uma exceção)
			System.out.println("Quadro de honra, meus parabens!");
		}
	}
	
}
