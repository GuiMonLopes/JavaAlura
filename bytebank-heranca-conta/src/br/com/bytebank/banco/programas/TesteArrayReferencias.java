package br.com.bytebank.banco.programas;

import br.com.bytebank.banco.classes.Conta;
import br.com.bytebank.banco.classes.ContaCorrente;
import br.com.bytebank.banco.classes.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 12);
		
		referencias[1] = cc2;
		
		//System.out.println(referencias[1].getNumero());
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1];//type cast
		System.out.println(ref.getNumero());

	}

}
