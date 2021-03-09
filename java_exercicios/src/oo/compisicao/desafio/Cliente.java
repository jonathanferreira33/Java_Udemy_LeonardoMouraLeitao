package oo.compisicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	final String nome;
	final List<Compra> compras = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	void addCompra(Compra compra){
		this.compras.add(compra);
	}
	
	double valorTotal() {
		double total = 0;
		
		for(Compra compra: compras) {
			total += compra.valorTotal();
		}
		
		return total;
	}

}
