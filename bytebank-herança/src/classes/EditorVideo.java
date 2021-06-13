package classes;

public class EditorVideo extends Funcionario {
	
	@Override
	public double getBonificacao() {
		System.out.println("EditorVideo");
		return super.getBonificacao() +100;
	}

}
