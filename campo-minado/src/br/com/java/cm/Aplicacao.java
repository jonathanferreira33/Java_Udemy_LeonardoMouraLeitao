package br.com.java.cm;

import br.com.java.cm.modelo.Tabuleiro;
import br.com.java.cm.visao.TabuleiroConsole;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6,6,3);
		new TabuleiroConsole(tabuleiro);		
	
	}
}
