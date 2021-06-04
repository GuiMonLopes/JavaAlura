package programa;

import classes.Conta;

public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		
		Conta conta2 = new Conta(1337, 16549);
		
		Conta conta3 = new Conta(2415, 56698);
		
		System.out.println(Conta.getTotal());
		
		//conta inconssitente com a regra de negocio
		//conta.setAgencia(-30);
		//conta.setNumero(-500);
		
		//System.out.println(conta.getAgencia());
		
	

	}

}
