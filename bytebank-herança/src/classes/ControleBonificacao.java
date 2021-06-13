package classes;

public class ControleBonificacao {
	
	private double soma;
	
	public void controleBonificacao(Funcionario f){
		
		double boni = f.getBonificacao();
        this.setSoma(this.getSoma() + boni);
		
	}

	public double getSoma() {
		return soma;
	}

	public void setSoma(double soma) {
		this.soma = soma;
	}

}
