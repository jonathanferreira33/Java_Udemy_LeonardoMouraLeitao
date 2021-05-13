package oo.heranca.teste;

import oo.heranca.desafio.Clubman;
import oo.heranca.desafio.Cooper;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Clubman c = new Clubman(270);
		c.acelerar();
		c.ligarTurbo();
		System.out.println(c);
		
		c.acelerar();
		System.out.println(c);
		
		c.acelerar();
		System.out.println(c);
		
		c.acelerar();
		c.freiar();
		c.nivelDoAr();
		System.out.println("Nivel do ar:" + c.nivelDoAr());
		System.out.println(c);
		
		
		
		Cooper c1 = new Cooper();
		c1.acelerar();
		System.out.println(c1);
		
		c1.freiar();
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		
		Clubman c2 = new Clubman(270);
		c2.ligarAr();
		c2.acelerar(); //+10
		c2.acelerar(); //+10
		c2.desligarAr();
		c2.ligarTurbo(); //+35
		c2.acelerar();
		System.out.println(c2);
	}
}
