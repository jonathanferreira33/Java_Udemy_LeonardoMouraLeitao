package oo.heranca;

public class Carro {
	final int VELOCIDADE_MAXIMA;
	double velocidadeAtual = 0;
	int delta = 5;
	
	Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}
		velocidadeAtual+= delta;
		
	}
	
	public void freiar() {
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
