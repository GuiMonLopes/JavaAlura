package classes;

public class Conta {
	

	    public double saldo;
	    public int agencia;
	    public int numero;
	    public Cliente titular;
	    
	   public void depositar (double valor){
	    	this.saldo+=valor;
	    }
	   
	   public boolean sacar(double valor){
		   if(this.saldo >= valor) {
			   this.saldo-=valor;
			   return true;
		   }else {
			   return false;
		   }
	   }
	   public boolean transferir(double valor, Conta destino) {
		   if(this.sacar(valor)) {
			   destino.depositar(valor);
			   return true;
		   }
		   return false;
		   
		   /*if(this.saldo >= valor) {
			   this.saldo-=valor;
			   destino.depositar(valor);
			   return true;
		   }else {
			   return false;
		   }*/
	   }

}
