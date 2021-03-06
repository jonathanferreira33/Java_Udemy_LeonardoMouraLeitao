package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet(); //Pode ser heterog�nio ou homog�neo / N�o aceita duplicado / n�o h� indexado / pode ser ordenado
		
		conjunto.add(1.2); // double -> Double, pois n�o aceita tipos primitivos e faz um AUTOBOX
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); //String
		conjunto.add(33); // int -> Integer
		conjunto.add('J'); //char -> Caracter
		
		System.out.println("Tamanho �: " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		
		System.out.println("Tamanho �: " + conjunto.size());
		
		System.out.println(conjunto.contains('j')); // se esta ou nao contido
		System.out.println(conjunto.contains('J'));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(33);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
//		conjunto.addAll(nums); //Uniao entre 2 conjuntos
		conjunto.retainAll(nums); // semelhanca
;		System.out.println(conjunto);

		conjunto.clear();
		System.out.println(conjunto);
	}

}
