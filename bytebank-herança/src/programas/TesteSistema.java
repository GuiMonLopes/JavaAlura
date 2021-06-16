package programas;


import classes.Gerente;
import classes.SistemaInterno;

public class TesteSistema {
	
	public static void main(String[] args) {
			
		
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		SistemaInterno sis = new SistemaInterno();
		
		sis.autentica(g);
		
	}

}
