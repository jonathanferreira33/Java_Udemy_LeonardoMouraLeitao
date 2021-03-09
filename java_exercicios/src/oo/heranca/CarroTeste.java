package oo.heranca;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Clubman c = new Clubman();
		c.acelerar();
		System.out.println(c);
		
		c.acelerar();
		System.out.println(c);
		
		c.acelerar();
		System.out.println(c);
		
		c.acelerar();
		c.freiar();
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
	}
}
