package programa;

import classes.Conta;

public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta contaDoPaulo = new Conta();
		
		contaDoPaulo.saldo=100;
		contaDoPaulo.depositar(50);
		
	System.out.println(contaDoPaulo.saldo);
	
	boolean conseguiuRetira = contaDoPaulo.sacar(20);
	System.out.println(conseguiuRetira);
	
	Conta contaDaMarcela = new Conta();
	contaDaMarcela.depositar(1000);
	if(contaDaMarcela.transferir(300, contaDoPaulo)) {
		System.out.println("Transferencia realziada com sucesso.");
	}else {
		System.out.println("Operação não realizada.");
	}
	System.out.println(contaDoPaulo.saldo);
	System.out.println(contaDaMarcela.saldo);
	
	}

}
