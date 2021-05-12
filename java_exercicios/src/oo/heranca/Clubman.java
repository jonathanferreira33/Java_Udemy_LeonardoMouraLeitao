package oo.heranca;

public class Clubman extends Carro {
	
	Clubman() {
		this(289);
	}
	
	
	public Clubman(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 215;
	}
	
}
