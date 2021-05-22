package excecao;



public class Basico {
	
	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {
			immprimirNomeDoAluno(a1);			
		} catch(Exception excecao) {
			System.out.println("Erro no momento de imprimir nome usuario");
		}
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {

			System.out.println("Ocorreu o erro: " + e.getMessage());
		}
		
		
		System.out.println("Fim :)");
	}
	
	public static void immprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}

}
