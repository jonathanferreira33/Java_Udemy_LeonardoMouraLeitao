package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			System.out.println("Quantos anulos?");
			int quantAlunos = entrada.nextInt();
			
			System.out.println("Quantas notas por alunos?");
			int quantNotas = entrada.nextInt();
			
			double[][] notasDaTurma = new double[quantAlunos][quantNotas];
			
			double total = 0;
			for (int i = 0; i < notasDaTurma.length; i++) {
				for (int j = 0; j < notasDaTurma[i].length; j++) {
					System.out.printf("Informa a nota %d do aluno %d: ", (i+1), (j+1));
					
					notasDaTurma[i][j] = entrada.nextDouble();
					total += notasDaTurma[i][j];
				}
				
			}
			
		double media = total / (quantAlunos * quantNotas);
		System.out.println("M�dia da turma �: " + media);
		
		for(double[] notasDoAluno: notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));			
		}
		
		entrada.close();
	}
}
