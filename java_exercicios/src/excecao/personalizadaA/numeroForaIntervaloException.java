package excecao.personalizadaA;

@SuppressWarnings("serial")
public class numeroForaIntervaloException extends RuntimeException {
	
	private String nomeDoAtributo;

	public numeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getmessage() {
		return String.format("O atributo %s está fora do intervalo permitido.", nomeDoAtributo);
	}

}
