package br.com.bytebank.banco.programas;

public class TesteArray {

	public static void main(String[] args) {

		int[] idades = new int[5];// inicializa o array com 0
		
		for(int i=0; i<idades.length; i++) {
			idades[i] = i*i;
		}
		
		for(int idade : idades){
			System.out.println(idade);
		}
		

	}

}
