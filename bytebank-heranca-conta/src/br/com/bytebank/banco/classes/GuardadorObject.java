package br.com.bytebank.banco.classes;

public class GuardadorObject {
	
	private Object[] referencias;
	private int posicaoLivre;
	
	
	public GuardadorObject() {
		
		this.referencias = new Object[10];
		this.posicaoLivre = 0;
	}
		
		public void adiciona(Object ref) {
			this.referencias[posicaoLivre] = ref;
			this.posicaoLivre++;
		}
		
		public int getQuantidadeDeElementos() {
			return this.posicaoLivre;
		}

		public Object getReferencia(int i) {
			
			return this.referencias[i];
		}
		
	}
	


