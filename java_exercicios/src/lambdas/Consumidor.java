package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		imprimir.accept(p1); //para imprimir individualmente
		
		Produto p2 = new Produto("Borracha", 0.5, 0.1);
		Produto p3 = new Produto("Lapiz", 1.5, 0.1);
		Produto p4 = new Produto("Lapiseira", 2.25, 0.25);
		Produto p5 = new Produto("Caderno", 17.3, 0.3);
		Produto p6 = new Produto("Mochila", 49.99, 0.2);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		
		produtos.forEach(imprimir); //para imprimir a lista, .accept fica subtendido pois .foreach recebe um Consumer
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
		
	}
}
