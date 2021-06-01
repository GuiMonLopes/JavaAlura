package programa;

import classes.Conta;

public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.saldo=100;
		conta.depositar(50);
		
	System.out.println(conta.saldo);
	}

}
