package generics;

public class CaixaObjetoTeste {
	
	public static void main(String[] args) {
		
		
		// FORMA INCORRETA OU NÃO ADEQUADA
		
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3); // double ele faz um autobox para Double
		
		// Integer coisa = (Integer) caixaA.abrir(); // java.lang.ClassCastException: class java.lang.Double cannot be cast to class java.lang.Integer
		Double coisa = (Double) caixaA.abrir();
		System.out.println(coisa);
		
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Caixa B"); // double ele faz um autobox para Double
		
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
	}

}
