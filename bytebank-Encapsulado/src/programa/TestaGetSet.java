package programa;

import classes.Cliente;
import classes.Conta;

public class TestaGetSet {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		//conta.titular = paulo;
		
		paulo.setNome("Paulo Silveira");
		
		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		
		//agora em duas linhas
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
	}

}
