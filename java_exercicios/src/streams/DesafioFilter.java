package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class DesafioFilter {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Fones de ouvido", 39.90, 0.0, false);
		Produto p2 = new Produto("Pós-barba", 49.90, 0.15, true);
		Produto p3 = new Produto("Camisa", 69.90, 0.13, false);
		Produto p4 = new Produto("Quadro", 79.90, 0.12, false);
		Produto p5 = new Produto("Bolsa", 89.90, 0.25, true);
		Produto p6 = new Produto("Maquiagem", 99.90, 0.0, false);
		Produto p7 = new Produto("Livro", 109.90, 0.18, false);
		Produto p8 = new Produto("Teclado", 159.90, 0.17, false);
		Produto p9 = new Produto("Revista", 15.80, 0.16, false);
		Produto p10 = new Produto("Pomada para cabelos", 9.90, 0.0, true);
		
		List<Produto> produtos =
				Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
		
		Predicate<Produto> comDesconto = p -> p.desconto != 0;
		
		Predicate<Produto> masculinos = m -> m.masculino;
		
		produtos.stream()
			.filter(comDesconto)
			.map(p -> p.nome)
			.forEach(System.out::println);
		
		System.out.println("\n");
		
		produtos.stream()
			.filter(masculinos)
			.map(p -> p.nome)
			.forEach(System.out::println);
	}
	

}
