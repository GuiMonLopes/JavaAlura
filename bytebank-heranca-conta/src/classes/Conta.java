package classes;

public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("O total de contas � "+Conta.total);
		
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Estou criando uma conta "+this.numero);
	}

	public abstract void depositar(double valor);

	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transferir(double valor, Conta destino) {
		if (this.sacar(valor)) {
			destino.depositar(valor);
			return true;
		}
		return false;

		/*
		 * if(this.saldo >= valor) { this.saldo-=valor; destino.depositar(valor); return
		 * true; }else { return false; }
		 */
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("N�o pode valor menor que zero.");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("N�o pode valor menor que zero.");
			return;
		}
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public static int getTotal() {
		return Conta.total;
	}

}
