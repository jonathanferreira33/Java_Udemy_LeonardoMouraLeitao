package excecao;

public class ChecadaVsNaoChecada {
	
	public static void main(String[] args) {
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Exception e) {
			System.out.println("Erro 2: " + e.getMessage());
		}
		
		System.out.println("Fim! ;)");
	}
	
	//Exceção NÃO checada ou NÃO verificada
	private static void geraErro1() throws RuntimeException { // tipo RuntimeException não força o tratamento do erro, não há obrigatoriedade, nem precisa declarar no método
		throw new RuntimeException("Ocorreu erro #01");
	}
	
	//Exceção checada ou verificada
	private static void geraErro2() throws Exception {
		throw new Exception("Ocorreu erro #02");

	}

}
