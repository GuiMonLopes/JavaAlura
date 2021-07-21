package br.com.bytebank.banco.programas;

import br.com.bytebank.banco.classes.ContaCorrente;
import br.com.bytebank.banco.classes.ContaPoupanca;
import br.com.bytebank.banco.classes.SaldoInsuficienteException;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
		ContaCorrente cc = new ContaCorrente(111, 1111);
		cc.depositar(100.0);

		ContaPoupanca cp = new ContaPoupanca(111, 2222);
		cp.depositar(200.0);

		cc.transferir(10.0, cp);

		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());

	}

}
