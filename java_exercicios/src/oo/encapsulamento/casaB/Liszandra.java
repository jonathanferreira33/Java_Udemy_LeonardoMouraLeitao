package oo.encapsulamento.casaB;

import oo.encapsulamento.casa.Jonathan;

public class Liszandra {
	
	Jonathan amigo = new Jonathan(); // N�o h� necessidade de intanciar, pois � possivel acesso via heran�a 
	
		void testeAcessos() {

			// System.out.println(amigo.segredo); // private
			// System.out.println(amigo.FazDentroDeCasa); // default
			// System.out.println(amigo.formaDeFalar); //protected
			System.out.println(amigo.altura); // public
			
		}

}
