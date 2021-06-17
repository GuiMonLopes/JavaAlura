package classes;

public class CalculadorDeImpostos {
	
	private double totalImposto;
	
	public void registra(Tributaveis t) {
		double valor = t.getValorImposto();
		this.totalImposto+=valor;
		
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
	

}
