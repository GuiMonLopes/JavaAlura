package classes;

public class Gerente extends Funcionario {
	
	private int senha;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}return false;
	}
	
	@Override
	public double getBonificacao() {
		System.out.println("Gerente");
		return super.getBonificacao()+super.getSalario();
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public int getSenha() {
		return senha;
	}

}
