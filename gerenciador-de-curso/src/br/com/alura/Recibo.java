package br.com.alura;

public class Recibo implements Comparable<Object> {
	
	private int numero;
	private int valor;
	
	public Recibo() {
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public int compareTo(Object o) {
		
		Recibo a = (Recibo) o;
		return Double.compare(this.numero, a.numero);
	}
	
	

}
