package oo.abstrato;

public class Cachorro extends Mamirefo{
	
	@Override
	public double mover() {
		// TODO Auto-generated method stub
		return 1.3;
	}
	
	@Override
	public final String mamar() { //sendo final o metodo não pode ser sobrescrito nas sub-classes, exatamente o oposto de uma classe abstrata que precisar ser em classes concretas.
		return "bebem leite";
	}
	
}
