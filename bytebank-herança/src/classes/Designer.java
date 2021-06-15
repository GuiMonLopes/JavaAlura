package classes;

public class Designer extends Funcionario {

	@Override
	public double getBonificacao() {
		System.out.println("Designer");
		return 150;
	}

}
