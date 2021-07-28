package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.classes.Conta;

public class ContaEspecial extends Conta {

	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
		
	}

	@Override
	public void depositar(double valor) {
		super.saldo += valor;

	}

}
