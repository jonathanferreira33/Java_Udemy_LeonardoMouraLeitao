package classe;

public class Equals {

	public static void main(String[] args) {
		VeiculoAbs carro1 = new Carro("palio", "Fiat", 20000.0);
		VeiculoAbs carro2 = new Carro("palio", "Fiat", 20000.0);
		
		System.out.println(carro1.equals(carro2));
	}
}
