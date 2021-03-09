package oo.compisicao;

public class CompraTeste {
	
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "Jonathan";
		compra1.itens.add(new Item("Caneta", 20, 1.90));
		compra1.itens.add(new Item("Lapiz", 10, 1.50));
		compra1.itens.add(new Item("Barracha", 20, 1.20));
		compra1.itens.add(new Item("caderno", 5, 9.50));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.getValorTortal());
			
	}

}
