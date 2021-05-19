package lambdas;

import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String[] args) {
		
		
		// Predicate recebe um unico parametro, do tipo determinado no generics, e retorna verdadeiro ou falso
		// é ideal para checar a boolean em uma lista
		Predicate<Produto> isCaro =
				prod -> (prod.preco * (1 - prod.desconto)) >= 1000;
		
		Produto produto = new Produto("Notebook", 3893.89, 0.15); //esperado true
		System.out.println(isCaro.test(produto));
		
		Produto produto2 = new Produto("Smartphone", 1100.89, 0.15); //esperado false
		System.out.println(isCaro.test(produto2));
	}

}
