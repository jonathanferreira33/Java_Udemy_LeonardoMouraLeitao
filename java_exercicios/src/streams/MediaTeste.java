package streams;

public class MediaTeste {
	
	public static void main(String[] args) {
		
		Media m1 = new Media();
		m1.adicionar(8.3);
		m1.adicionar(9.2);
		
		Media m2 = new Media().adicionar(10.0).adicionar(9.4).adicionar(5.8);
		
		System.out.println(m1.getValor());
		System.out.println(m2.getValor());
		
		double somaMedia =	Media.combinar(m1, m2).getValor();
		
		System.out.println(somaMedia);
	}

}
