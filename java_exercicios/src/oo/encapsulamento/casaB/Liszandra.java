package oo.encapsulamento.casaB;

import oo.encapsulamento.casa.Jonathan;

public class Liszandra {
	
	Jonathan amigo = new Jonathan(); // Não há necessidade de intanciar, pois é possivel acesso via herança 
	
		void testeAcessos() {

			// System.out.println(amigo.segredo); // private
			// System.out.println(amigo.FazDentroDeCasa); // default
			// System.out.println(amigo.formaDeFalar); //protected
			System.out.println(amigo.altura); // public
			
		}

}
