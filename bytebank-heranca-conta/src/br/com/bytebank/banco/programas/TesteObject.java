package br.com.bytebank.banco.programas;

import br.com.bytebank.banco.classes.ContaCorrente;
import br.com.bytebank.banco.classes.ContaPoupanca;

public class TesteObject {
	
	  public static void main(String[] args) {

	        Object cc = new ContaCorrente(22, 33);
	        Object cp = new ContaPoupanca(33, 22);

	        System.out.println(cc);
	        System.out.println(cp);
	    }
	}


