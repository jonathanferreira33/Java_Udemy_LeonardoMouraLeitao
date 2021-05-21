package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
	
	public static void main(String[] args) {
			
		Aluno a1 = new Aluno("Jonathan", 8.9);
		Aluno a2 = new Aluno("Jon", 6.0);
		Aluno a3 = new Aluno("J", 5.5);
		Aluno a4 = new Aluno("Jhouus", 9.9);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		
		Function<Aluno, Double> apenasNorta = a -> a.nota;
		
		BinaryOperator<Double> somatoria = (a, b) -> a + b;
		
		alunos.stream()
			.filter(aprovado)
			.map(apenasNorta)
			.reduce(somatoria)
			.ifPresent(System.out::println);
	}
	
}
