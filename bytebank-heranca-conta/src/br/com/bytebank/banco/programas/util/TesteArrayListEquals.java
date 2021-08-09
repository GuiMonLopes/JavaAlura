package br.com.bytebank.banco.programas.util;

import java.util.ArrayList;

import br.com.bytebank.banco.classes.Conta;
import br.com.bytebank.banco.classes.ContaCorrente;

public class TesteArrayListEquals {
	public static void main(String[] args) {
		//<> Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc1 = new ContaCorrente(22, 11);
		lista.add(cc1);
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 22);
		
		boolean existe = lista.contains(cc3);
		
		System.out.println(existe);
		
		for(Conta conta:lista) {
			System.out.println(conta);
		}
		
		
	}
}
