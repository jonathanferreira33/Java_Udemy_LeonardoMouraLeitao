package oo.heranca;

public class Monstro extends Jogador {
	
	public Monstro() { //padrao
		this(0, 0);
	}
	
	public Monstro(int x, int y) { //explicito
		super(x, y);
	}
}

