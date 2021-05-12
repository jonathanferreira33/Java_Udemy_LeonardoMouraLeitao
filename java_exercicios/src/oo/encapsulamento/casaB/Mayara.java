package oo.encapsulamento.casaB;

import oo.encapsulamento.casa.Jonathan;

public class Mayara extends Jonathan {
	
    //Jonathan conhecido = new Jonathan(); // N�o h� necessidade de intanciar, pois � possivel acesso via heran�a 
	
	void testeAcessos() {

		//System.out.println(segredo); // private
		//System.out.println(FazDentroDeCasa); // default, s� transmitido se a classe filho for transmido pelo mesmo pacote
		System.out.println(formaDeFalar); //protected, n�o funciona caso tente acessar atributo de instancia : new Jonathan.formaDeFaler por ex
		System.out.println(altura); // public
		System.out.println(new Jonathan().altura); // public
	}

}
