package br.com.bytebank.banco.programas;

import br.com.bytebank.banco.classes.Conta;
import br.com.bytebank.banco.classes.ContaCorrente;
import br.com.bytebank.banco.classes.GuardadorDeContas;

public class TesteGuardador {

	public static void main(String[] args) {
		GuardadorDeContas guardar = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(22, 11);
		guardar.adiciona(cc);
		
		int tamanho = guardar.getQuantidadeDeElementos();
		
		System.out.println(tamanho);
		
		Conta ref = guardar.getReferencia(0);
		System.out.println(ref.getNumero());
	}
	

}
