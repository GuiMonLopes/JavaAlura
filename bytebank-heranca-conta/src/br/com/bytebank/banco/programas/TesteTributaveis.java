package br.com.bytebank.banco.programas;

import br.com.bytebank.banco.classes.CalculadorDeImpostos;
import br.com.bytebank.banco.classes.ContaCorrente;
import br.com.bytebank.banco.classes.SeguroDeVIda;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(2222, 222222);
		
		cc.depositar(100.00);
		
		SeguroDeVIda seguro = new SeguroDeVIda();
		
		CalculadorDeImpostos calc = new CalculadorDeImpostos();
		
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
		
	}

}
