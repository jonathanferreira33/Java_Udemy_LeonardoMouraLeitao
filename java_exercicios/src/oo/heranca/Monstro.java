package oo.heranca;

public class Monstro extends Jogador {
	
	Monstro() { //padrao
		this(0, 0);
	}
	
	Monstro(int x, int y) { //explicito
		super(x, y);
	}
}

