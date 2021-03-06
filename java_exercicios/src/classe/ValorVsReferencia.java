package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		double a = 2;
		double b = a; //atribuicao do valor (tipo prmitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		
		Data d1 = new Data(1, "Jul", 2021);
		Data d2 = d1; // atibuicao por referencia
		
		d1.dia = 31;
		d2.mes = "Jun";
		
		d1.ano = 2030;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrado(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 5;
		alteraraPrimitivo(c);
		System.out.println(c);
		
	}

	static void voltarDataParaValorPadrado( Data d ) {
		d.dia = 1;
		d.mes = "Jan";
		d.ano = 1970;
	}
	
	static void alteraraPrimitivo (int a) {
		a++;
	}
}
