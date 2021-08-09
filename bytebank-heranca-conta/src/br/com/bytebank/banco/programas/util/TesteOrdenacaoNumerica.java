package br.com.bytebank.banco.programas.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.classes.Cliente;
import br.com.bytebank.banco.classes.Conta;
import br.com.bytebank.banco.classes.ContaCorrente;
import br.com.bytebank.banco.classes.ContaPoupanca;

public class TesteOrdenacaoNumerica {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.depositar(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setTitular(clienteCC2);
		cc2.depositar(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.depositar(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setTitular(clienteCC4);
		cc4.depositar(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		for (Conta conta : lista) {
			System.out.println(conta);
		}

//		NumeroDaContaComparator comparator = new NumeroDaContaComparator();

		lista.sort(new NumeroDaContaComparator());

		System.out.println("------------------");

		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
//		System.out.println("------------------");
//		
//		TitularDaContaComparator comparator1 = new TitularDaContaComparator();
//
//		lista.sort(comparator1);
//		
//
//		for (Conta conta : lista) {
//			System.out.println(conta);
//		}
		
		System.out.println("------------");
		
		Collections.sort(lista);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}

}

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		
		return Integer.compare(c1.getNumero(), c2.getNumero());
		
		
//		return c1.getNumero() - c2.getNumero();

//		if (c1.getNumero() < c2.getNumero()) {
//			return -1;
//		}
//		if (c1.getNumero() > c2.getNumero()) {
//			return 1;
//		}
//
//		return 0;
	}

}


