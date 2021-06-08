package generics;

public class CaixaObjeto {
	
	private Object coisa;
	
	public void guardar(Object coisa) { //set
		this.coisa = coisa;
	}
	
	public Object abrir() {
		return coisa;
	}

}
