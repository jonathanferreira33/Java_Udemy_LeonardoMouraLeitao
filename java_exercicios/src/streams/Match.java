package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Jonathan", 8.9);
		Aluno a2 = new Aluno("Jon", 6.0);
		Aluno a3 = new Aluno("J", 5.5);
		Aluno a4 = new Aluno("Jhouus", 9.9);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Predicate<Aluno> reprovado = aprovado.negate();
		
		System.out.println(alunos.stream().allMatch(aprovado)); //TODOS false J = 5.5
		System.out.println(alunos.stream().anyMatch(aprovado)); //ALGUEM true 
		System.out.println(alunos.stream().noneMatch(aprovado)); //NINGUEM false
		System.out.println(alunos.stream().noneMatch(reprovado)); // false
	}

}
