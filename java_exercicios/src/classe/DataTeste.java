package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		
		
//		System.out.printf("Seu anivers�rio � : %d / %s / %d ", d1.dia, d1.mes, d1.ano );
		System.out.println(d1.obterDataFormatada());
		
		Data d2 = new Data(01, "JAN", 1970);
		System.out.println(d2.obterDataFormatada());
	}
	
}
