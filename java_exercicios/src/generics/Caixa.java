package generics;

public class Caixa<TIPOGENERICO>  {
	
	private TIPOGENERICO coisa;
	
	public void guardar(TIPOGENERICO coisa) { //set
		this.coisa = coisa;
	}
	
	public TIPOGENERICO abrir() { //get
		return coisa;
	}

}
