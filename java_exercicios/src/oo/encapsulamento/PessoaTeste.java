package oo.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Jonathan", "Ferreira", 27);
		
		/*
		 * Leitura com classe Pessoa Public
		p1.idade = -30; // alterar valor variavel
		
		System.out.println(p1.idade); // ler
		*/
		
		// ler idade pessoa com classe Pessoa Private
		System.out.println(p1.lerIdade());
		
		// alterar idade pessoa com classe Pessoa Private
		p1.alterarIdade(28);
		System.out.println(p1.lerIdade());
		
		System.out.println(p1.getNomeCompleto());
	}

}
