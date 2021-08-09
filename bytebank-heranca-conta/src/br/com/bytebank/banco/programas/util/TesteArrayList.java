package br.com.bytebank.banco.programas.util;

import java.util.ArrayList;

import br.com.bytebank.banco.classes.Conta;
import br.com.bytebank.banco.classes.ContaCorrente;

public class TesteArrayList {
	public static void main(String[] args) {
		//<> Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc1 = new ContaCorrente(22, 11);
		lista.add(cc1);
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);

		System.out.println(lista.size());

		Conta ref = lista.get(0);

		System.out.println(ref);
		
		lista.remove(0);
		
		System.out.println(lista.size());
		
		Conta cc3 = new ContaCorrente(22, 33);
		lista.add(cc3);
		Conta cc4 = new ContaCorrente(22, 44);
		lista.add(cc4);
		
		for(Conta conta:lista) {
			System.out.println(conta);
		}
		
		
	}
}
