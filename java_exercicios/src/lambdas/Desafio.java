package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		
		
		/*
		 * 1. A partir do produto calcular o preço real(com desconto)
		 * 2. Imposto municipal: >=2500 (8,5%) | < 2500 (isento)
		 * 3. Frete: >= 3000 (100) | <3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$ 1234,56 
		 */
		
		Function<Produto, Double> precoReal = 
				produto -> produto.preco * (1 - produto.desconto);
				
		UnaryOperator<Double> impostoMunicipal =
				preco -> preco >= 2500 ? preco * 1.085 : preco;
				
		UnaryOperator<Double> frete=
				preco -> preco >= 3000 ? preco + 100 : preco + 50;
				
		UnaryOperator<Double> arredondar =
				preco -> Math.round(preco*100.0)/100.0;;
		
		Function<Double, String> formatar =
				preco -> ("R$" + preco).replace(".", ",");
		
		
		Produto p = new Produto("Ipad", 4000.0, 0.10);		
		String preco = precoReal // 3600 (- 10% de desconto)
				.andThen(impostoMunicipal) //3906 (+ 8,5%)
				.andThen(frete) // 4006 (+ 100 de frete)
				.andThen(arredondar) // 4006,00
				.andThen(formatar) // R$4006,00
				.apply(p);
				
		System.out.println("Preço final: " + preco);
		
	}
}
