package br.com.alura.bytebank;

import br.com.bytebank.banco.classes.Conta;
import br.com.bytebank.banco.classes.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {
		
		
		Conta c = new ContaCorrente(123,321);
		c.depositar(200.00);
		
		System.out.println(c.getSaldo());
	}

}
