package classes;

public class Gerente extends Funcionario implements Autenticavel{
	
	private int senha;

	
	@Override
	public double getBonificacao() {
		System.out.println("Gerente");
		return super.getSalario();
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}
		return false;
	}
	

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
		
	}
	
	

}
