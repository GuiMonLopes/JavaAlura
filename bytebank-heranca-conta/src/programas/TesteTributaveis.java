package programas;

import classes.CalculadorDeImpostos;
import classes.ContaCorrente;
import classes.SeguroDeVIda;

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
