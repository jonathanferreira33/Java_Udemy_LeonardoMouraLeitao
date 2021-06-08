package generics;

public class CaixaTeste {
	
	public static void main(String[] args) {
		Caixa<String> caixaA = new Caixa<>(); // caso n�o informe o tipo ser� tipo Object
		caixaA.guardar("Segredo");
		
		System.out.println(caixaA.abrir());
		
		Caixa<Double> caixaB = new Caixa<>();
		caixaB.guardar(33.33);
		Double coisaB = caixaB.abrir();
		System.out.println(coisaB);
	}
}
