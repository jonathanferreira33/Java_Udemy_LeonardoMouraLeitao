package oo.heranca;

public class Carro {
	
	double velocidadeAtual = 0;
	
	void acelerar() {
		velocidadeAtual+= 5;
		
	}
	
	void freiar() {
		if(velocidadeAtual >= 5) {
			velocidadeAtual-= 5;			
		}else {
			velocidadeAtual = 0;
		}
		
	}
	
	public String toString() {
		return "Velocidade atual é " + velocidadeAtual + "km/h.";
	}
}
