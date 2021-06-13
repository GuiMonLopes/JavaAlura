package programas;

import classes.ControleBonificacao;
import classes.EditorVideo;
import classes.Funcionario;
import classes.Gerente;

public class TesteReferencia {
	
	public static void main(String[] args) {
		
		 Gerente g1 = new Gerente();
         g1.setNome("Marcos");
         g1.setSalario(5000.0);

         Funcionario f = new Funcionario();
         f.setSalario(2000.0);

         EditorVideo ev = new EditorVideo();
         ev.setSalario(2500.0);

         ControleBonificacao controle = new ControleBonificacao();
         controle.controleBonificacao(g1);
         controle.controleBonificacao(f);
         controle.controleBonificacao(ev);

         System.out.println(controle.getSoma());
		
	}

	
	

}
