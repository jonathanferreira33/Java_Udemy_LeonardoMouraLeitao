package controle;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
		String faixa = "preta";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei Bassai-Dai ...");
		case "marrom":
			System.out.println("Sei Tekki Shodan ...");
		case "roxa":
			System.out.println("Sei Heian Godan ...");
		case "verde":
			System.out.println("Sei Heian Yodan ...");
		case "laranja":
			System.out.println("Sei Heian Sandan ...");
		case "vermelha":
			System.out.println("Sei Heian Nidan ...");
		case "amarela":
			System.out.println("Sei Heian Shodan ...");
		default:
			System.out.println("Estou em aprendizado constante");
		}
		
	}

}
