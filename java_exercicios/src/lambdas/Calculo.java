package lambdas;

@FunctionalInterface //Anota��o deixa claro que s� pode existir 1 unica func�o/metodo abstract nessa classe
public interface Calculo {
	
	public abstract double executar(double a, double b);
	
	//h� possibilidade da criacao de outros metodos caso sejam default ou static
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "Muito Legal";
	}
}
