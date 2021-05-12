package oo.encapsulamento.casa;

public class Iza {
	
	Jonathan esposo = new Jonathan();
	
	void testeAcessos() {
		//segredo
		//fazEmCasa
		//formaDeFalar
		//altura
		
		// System.out.println(esposo.segredo); // private
		System.out.println(esposo.FazDentroDeCasa); // default
		System.out.println(esposo.formaDeFalar); //protected
		System.out.println(esposo.altura); // public
	}

}
