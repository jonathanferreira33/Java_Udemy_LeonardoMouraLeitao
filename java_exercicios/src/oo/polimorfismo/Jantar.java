package oo.polimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(89.65);
		
		Arroz intgrediente1 = new Arroz(0.25);
		Feijao intgrediente2 = new Feijao(0.15);
		
		System.out.println(convidado.getPeso());
		convidado.comer(intgrediente1);
		convidado.comer(intgrediente2);
		System.out.println(convidado.getPeso());
		
		Sorvete intgrediente3 = new Sorvete(0.400);
		convidado.comer(intgrediente3);
		System.out.println(convidado.getPeso());
	}

}
