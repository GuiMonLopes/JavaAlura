package programas;

import classes.Conta;

public class TestaSacaNegativo {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.depositar(100);
		conta.sacar(200);
		System.out.println(conta.getSaldo());
		
	}

}
