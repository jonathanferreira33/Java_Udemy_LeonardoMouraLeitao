package oo.compisicao.desafio;

public class Sistema {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.addItem("Lapiz", 0.9, 15);
		compra1.addItem(new Produto("Caderno", 9.9), 3);
		
		Compra compra2 = new Compra();
		compra2.addItem("Notebook", 4999.99, 1);
		compra2.addItem(new Produto("Mouse", 99.9), 2);
		
		Compra compra3 = new Compra();
		compra2.addItem("Cadeira Gamer", 999.99, 1);
		
		Cliente cliente = new Cliente("Jonathan Ferreira");
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		cliente.addCompra(compra3); //utilizando metodo, metodo ideal
		
		
		System.out.println(cliente.valorTotal());
	}
}
