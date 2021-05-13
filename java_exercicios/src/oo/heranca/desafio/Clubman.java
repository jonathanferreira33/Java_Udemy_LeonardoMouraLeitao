package oo.heranca.desafio;

public class Clubman extends Carro implements Esportivo, Luxo {
	
	private boolean ligarTurbo;
	private boolean ligarAr;
	
	Clubman() {
		this(289);
	}

	public Clubman(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}


	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;

	}

	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		}else if(ligarTurbo && ligarAr) {
			return 30;
		}else if(!ligarTurbo && ligarAr) {
			return 10;
		}else {
			return 15;
		}
	}

}
