package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	
	public static void main(String[] args) {
		
		
		Aluno a1 = new Aluno("Jonathan", 9.9);
		Aluno a2 = new Aluno("Jon", 6.5);
		Aluno a3 = new Aluno("J", 7.0);
		Aluno a4 = new Aluno("Jhouus", 10.0);
		Aluno a5 = new Aluno("Jonjon", 7.7);
		Aluno a6 = new Aluno("JF", 5.9);
	
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovadoAcimaDe9 = a -> a.nota >= 9; 
		
		Function<Aluno, String> saudacaoReprovado =
				a -> "Não foi dessa vez " + a.nome + " TMJ no próximo ano";
		
		alunos.stream()
		.filter(a -> a.nota <7)
		.map(saudacaoReprovado)
		.forEach(System.out::println);
		
		
		alunos.stream()
			.filter(a -> a.nota >=7 && a.nota < 9)
			.map(a -> "Parabéns " + a.nome + " você foi aprovado!!")
			.forEach(System.out::println);
		
		
		alunos.stream()
		.filter(aprovadoAcimaDe9)
		.map(a -> "Parabéns " + a.nome + " você foi aprovado com excelência!!")
		.forEach(System.out::println);
	}
	
	

}
