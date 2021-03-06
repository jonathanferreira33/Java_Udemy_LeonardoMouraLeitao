package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Exercicios {
	
	public static void main(String[] args) {
		
		double[] notasAlunosA = new double[3];
		notasAlunosA[0] = 7.9;
		notasAlunosA[1] = 8;
		notasAlunosA[2] = 6.7;
				
		System.out.println(Arrays.toString(notasAlunosA));
		System.out.println(notasAlunosA[0]);
		System.out.println(notasAlunosA[notasAlunosA.length -1]); //pegar ultima
		
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunosA.length; i++) {
			totalAlunoA += notasAlunosA[i];
		}
		
		System.out.println(totalAlunoA / notasAlunosA.length);
		
		final double notaMat = 7.8;
		double[] notasAlunoB = { notaMat, 8.2, 3.4, 9.3, 9.9 };
		
		double totalAlunoB = 0;
		for(int i = 0 ; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		System.out.println(totalAlunoB / notasAlunoB.length);
		
		for(double totalB: notasAlunoB) {
			System.out.println("Foreach " + totalB);
		}
		
	}
}
