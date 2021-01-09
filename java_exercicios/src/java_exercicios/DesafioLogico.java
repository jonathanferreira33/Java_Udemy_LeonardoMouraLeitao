package java_exercicios;

public class DesafioLogico {
	
	// Trabalho na terça V e trabalho na quinta V = TV 60' + sorvete familia
	// Trabalho na terça V ou trabalho na quinta V = TV 32' + sorvete familia
	// nenhum trabalho = familia com fome e triste
	public static void main(String[] args) {
		
		boolean trabalhoTerca = !true;
		boolean trabalhoQuinta = false;
		
		if(trabalhoTerca && trabalhoQuinta) {
			System.out.println("#Partiu shopping, netflix no cinema e sorvete por minha conta");
		}else if(trabalhoTerca || trabalhoQuinta) {
			System.out.println("#Partiu shopping, 32' melho que nada e sorvete por minha conta");
		}else{
			System.out.println("Semana que vem será melhor!");
		}
		
		
		// ou
		
		boolean comprouTv60 = trabalhoTerca || trabalhoQuinta;
		boolean comprouTv32 = trabalhoTerca && trabalhoQuinta;
		boolean partiuShopping = trabalhoTerca ^ trabalhoQuinta;
		boolean naoCompraNada = !trabalhoTerca && !trabalhoQuinta;
	}
	
}
