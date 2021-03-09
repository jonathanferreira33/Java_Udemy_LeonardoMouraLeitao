package arrays;

import java.util.*;


public class Queue_ {
	
	public static void main(String[] args) {
		Queue<String> filaBanco = new LinkedList<String>();
		
		
		filaBanco.add("Mayara");
		filaBanco.add("Liliana");
		filaBanco.add("Deise");
		filaBanco.add("Sharon");
		filaBanco.add("Thaina");
		filaBanco.add("Liszandra");
		
		System.out.println(filaBanco);
		
		String clienteSerAtendido = filaBanco.poll();
		System.out.println(clienteSerAtendido);
		System.out.println(filaBanco);
		
		String primeiroCliente = filaBanco.peek();
		System.out.println(primeiroCliente);
		System.out.println(filaBanco);
		
		String primeiroClienteOuErro = filaBanco.element();
		System.out.println(primeiroClienteOuErro);
		System.out.println(filaBanco);
		
		for(String cliente: filaBanco) {
			System.out.println(cliente);
		}
		
		Iterator<String> interatorFilaBanco = filaBanco.iterator();
		
		while (interatorFilaBanco.hasNext()) {
			System.out.println("----> " + interatorFilaBanco.next());
		}
		
		System.out.println(filaBanco.size());
		
		
		
		filaBanco.clear();
		System.out.println(filaBanco);
		
		System.out.println(filaBanco.isEmpty());
		
	}

}
