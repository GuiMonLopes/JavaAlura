package classes;

public class Cliente implements Autenticavel {
	
	private int senha;
	
	public void teste() {
		
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
