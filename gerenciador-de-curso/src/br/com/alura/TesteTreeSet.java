package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteTreeSet {

	public static void main(String[] args) {

		Recibo rec1 = new Recibo();
		rec1.setNumero(0);
		Recibo rec2 = new Recibo();
		rec2.setNumero(1);
		Recibo rec3 = new Recibo();
		rec3.setNumero(2);
		
		Set<Recibo> recibos = new TreeSet<>();
		
		recibos.add(rec1);
		recibos.add(rec2);
		recibos.add(rec3);
		
		Iterator<Recibo> iterador = recibos.iterator();
		
		while(iterador.hasNext()) {
			Recibo proximo = iterador.next();
			System.out.println(proximo.getNumero());
		}

		
	}

}
