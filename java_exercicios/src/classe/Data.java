package classe;

public class Data {
	
	int dia;
	String mes;
	int ano;
	
	String obterDataFormatada() {
		return String.format( "%d / %s / %d ", this.dia, mes, ano);
	}
	
	Data() { //contrustor padr�o com data fixa caso n�o ocorra atribui��o
//		dia = 01;
//		mes = "JAN";
//		ano = 1970;
		
		this(1,"JAN",1970); //FORMA USADA A APARTIR DE UM CONSTRUTOR
	}
	
	Data(int dia, String mes, int ano) {
		this.dia = dia; //REFERENCIAR O OBJETO ATUAL 
		this.mes = mes;
		this.ano = ano;
	}
	
	static void teste() {
//		this.dia = 3; // n�o � possivel acessar this(instancia) em metodo void
	}
}

