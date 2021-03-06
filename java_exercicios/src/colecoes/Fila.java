package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Jonathan"); //caso n�o consiga add por falta de tamanho, por exemplo, ele retorna erro
		fila.offer("Jhouus"); //casa n�o consiga add ele retorna false
		fila.offer("Manolo");
		fila.offer("Papu");
		fila.offer("Madela");
		System.out.println(fila.peek()); //quando fila vazia: proximo da fila, retorna null
		System.out.println(fila.element());//caso esteja vazia retorna erro NoSuchElemntException(exce��o)
		
		fila.size(); //tamanho
		fila.isEmpty(); //verificar se esta vazia
		fila.clear(); //limpar
		fila.contains("...");
		
		fila.remove(); //remove o primeiro da lista, caso vazia retorna exce��o
		System.out.println(fila.poll());//retorna o primeiro da fila e o remove, caso vazia retorna null
		
	}

}
