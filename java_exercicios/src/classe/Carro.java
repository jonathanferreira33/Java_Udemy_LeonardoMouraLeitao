package classe;

public class Carro extends VeiculoAbs {
	
	public Carro(String modelo, String marca, double valorVenal) {
		super(modelo, marca, valorVenal);
	}
	
	public Carro(String modelo, String marca, double valorVenal, int quantidadeDePortas) {
		super(modelo, marca, valorVenal);
		this.quantidadeDePortas = quantidadeDePortas;
	}
	
	private int quantidadeDePortas;
}
