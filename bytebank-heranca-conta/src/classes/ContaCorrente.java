package classes;

public class ContaCorrente extends Conta implements Tributaveis {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean sacar(double valor) {
		double valorSacar = valor + 0.20;
		return super.sacar(valorSacar);
	}

	@Override
	public void depositar(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	

}
