package lambdas;

@FunctionalInterface //Anotação deixa claro que só pode existir 1 unica funcão/metodo abstract nessa classe
public interface Calculo {
	
	public abstract double executar(double a, double b);
	
	//há possibilidade da criacao de outros metodos caso sejam default ou static
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "Muito Legal";
	}
}
