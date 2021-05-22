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
	
	//Exce��o N�O checada ou N�O verificada
	private static void geraErro1() throws RuntimeException { // tipo RuntimeException n�o for�a o tratamento do erro, n�o h� obrigatoriedade, nem precisa declarar no m�todo
		throw new RuntimeException("Ocorreu erro #01");
	}
	
	//Exce��o checada ou verificada
	private static void geraErro2() throws Exception {
		throw new Exception("Ocorreu erro #02");

	}

}
