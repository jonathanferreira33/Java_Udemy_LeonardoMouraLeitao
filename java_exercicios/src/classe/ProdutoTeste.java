package classe;


public class ProdutoTeste {
	
	public static void main(String[] args) {

		Produto p1 = new Produto(); // contrutor padrão
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		
		Produto.desconto = 0.50; //alterando todos descontros de Produtos por ser um atribuo estatico
//		p1.desconto = 0.50; //alterando todos descontros de Produtos POREM maneira implicita, falsa sensação de alteração apenas do p1
		
		
		double precoFinal1 = p1.precocomDesconto();
		
		var p2 = new Produto("Caneta Azul", 12.50);

		
		double precoFinal2 = p2.precocomDesconto();
		
		
		double totalCompras = precoFinal1 + precoFinal2;
		
		System.out.println(precoFinal1);
		System.out.println(precoFinal2);
		System.out.printf("Valor final do Carrinho com desconto é R$%.2f:", totalCompras);
		
	}
}
