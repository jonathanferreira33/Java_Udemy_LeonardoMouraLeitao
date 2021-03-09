package oo.heranca;

public class Jogador {
	
	int x;
	int y;
	
	boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x);
		return true;
	}
	
	boolean andar(Direcao direcao) {
		
		switch(direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}
		
		return true;
	}
}
