package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack { //Pilha LIFO, primeira entrar � ultimo a sair
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno Pr�ncipe");
		livros.push("Game Of Thrones");
		livros.push("O Senhos dos An�is");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		//remover:
		livros.pop();
		livros.poll();
		livros.remove();
	}

}
