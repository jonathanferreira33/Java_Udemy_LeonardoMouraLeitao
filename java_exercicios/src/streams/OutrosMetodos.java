package streams;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Jonathan", 8.9);
		Aluno a2 = new Aluno("Jon", 6.0);
		Aluno a3 = new Aluno("J", 5.5); 
		Aluno a4 = new Aluno("Jhouus", 9.9);
		Aluno a5 = new Aluno("Joao", 7.9);
		Aluno a6 = new Aluno("Helena", 10.0);
		Aluno a7 = new Aluno("Thais", 3.5);
		Aluno a8 = new Aluno("Manolo", 9.8);
		Aluno a9 = new Aluno("Thais", 3.5); //duplicação
		Aluno a10 = new Aluno("Manolo", 9.8); //duplicação
		
		List<Aluno> alunos =
				Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);
		
		System.out.println("distinct...");
		alunos.stream()
			.distinct()
			.forEach(System.out::println); //necessário implemenção metodos Hashcode e equals
		
		System.out.println("\nSkip/Limit");
		alunos.stream()
			.distinct()
			.skip(2) // assim começa em a3
			.limit(2) // assim seleciona a3 e a4
			.forEach(System.out::println);
		
		System.out.println("\ntakeWhile"); //pegar elementos em qual true determinadas condição
		alunos.stream()
			.distinct()
			.takeWhile(a -> a.nota >= 7)
			.forEach(System.out::println);//somente a1, pois assim que a condição for false ele para
	}

}
