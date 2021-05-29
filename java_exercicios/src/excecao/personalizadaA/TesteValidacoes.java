package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("jhouus", 7);
			Validar.aluno(aluno);
			
			Validar.aluno(null);
		} catch (stringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (numeroForaIntervaloException | IllegalArgumentException e) { // Outra forma: catch (exception1 |(ou) exception2  e) {}
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
		
	}
}
