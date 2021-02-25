package colecoes;

import java.util.HashMap;
import java.util.Map.Entry;


public class Map { //chave e valor
	
	public static void main(String[] args) {
		
		java.util.Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Jon");
		usuarios.put(1, "Jonathan");
		
		System.out.println(usuarios.size()); // 1 pois não é duplicidade na chave
		
		usuarios.put(2, "Jon");
		usuarios.put(3, "Ferreira");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet()); //imprime das chaves
		System.out.println(usuarios.values()); //imprime valores
		System.out.println(usuarios.entrySet());// imprime chaves e valores
		
		System.out.println(usuarios.containsKey(3));
		System.out.println(usuarios.containsValue("J"));
		
		System.out.println(usuarios.get(3)); //valor da chave // NÃO É INDICE
		
		System.out.println(usuarios.remove(2));
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet() ) { //imprime chave e valor
			System.out.print(registro.getKey() + " ");
			System.out.println(registro.getValue());
		}
	}

}
