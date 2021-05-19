package lambdas;

public class Produto extends Object { // ou n�o escrever nada da no mesmo

	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {
		double precoFinal = preco * (1 - desconto);
		return "Nome: " + nome + "\nPre�o: " + precoFinal;
	}
}
