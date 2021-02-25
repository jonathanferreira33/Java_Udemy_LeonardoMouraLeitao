package classe.desafio;

public class Jantar {
	
	public static void main(String[] args) {
		Comida c1 = new Comida("Arroz", 0.223);
		Comida c2 = new Comida("Feijao", 0.354);
		
		Pessoa p = new Pessoa("Babi", 50.39);
		System.out.println(p.apresentar());
		p.comer(c1);
		System.out.println(p.apresentar());
		p.comer(c2);
		System.out.println(p.apresentar());
	}
	
}