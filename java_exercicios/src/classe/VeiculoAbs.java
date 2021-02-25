package classe;

public abstract class VeiculoAbs {
	
	private String modelo;
	private String marca;
	
	
	
	private double valorVenal;
	
	public VeiculoAbs(String modelo, String marca, double valorVenal) {
		
		this.modelo = modelo;
		this.marca = marca;
		this.valorVenal = valorVenal;
	}
	
	@Override //sobrescrever o medtodo equals
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
	
		VeiculoAbs comparavel;
		if(obj instanceof VeiculoAbs) {
			comparavel = (VeiculoAbs)obj;
		} else {
			return false;
		}
		
		if(comparavel.marca == this.marca && comparavel.modelo == this.modelo && comparavel.valorVenal == this.valorVenal) {
			return true;
		}
		
		return false;
	}
	
	
}
