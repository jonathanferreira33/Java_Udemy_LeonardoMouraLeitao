package oo.compisicao;

public class Motor {
	
	final Carro carro;
	
	Motor(Carro carro) {
		this.carro = carro;
	}
	
	boolean ligado = false;
	double fatorInjecao = 1;
	
	int giros() {
		if(!ligado) {
			return 0;
		} else { 
			return (int) Math.round(fatorInjecao * 3000);
		}
	}
}
