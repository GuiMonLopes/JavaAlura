package programas;

import classes.Conta;
import classes.ContaCorrente;


public class TesteSaca {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(123, 321);
		
		conta.depositar(200.00);
		
		try {
			conta.sacar(210.00);
		}catch(Exception ex) {
			System.out.println("Ex: " + ex.getMessage());
		}
		
		
		System.out.println(conta.getSaldo());
	}

}
