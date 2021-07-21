package br.com.bytebank.banco.classes;

public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		
		if(agencia < 1) {
            throw new IllegalArgumentException("Agencia inválida");
        }

        if(numero < 1) {
            throw new IllegalArgumentException("Numero da conta inválido");
        }
		Conta.total++;
		//System.out.println("O total de contas é "+Conta.total);
		
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Estou criando uma conta "+this.numero);
	}

	public abstract void depositar(double valor);

	public void sacar(double valor) throws SaldoInsuficienteException {
		
		
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: "+ this.saldo + ", Valor: "+ valor);
		} 
		
		this.saldo -= valor;
	}

	public void transferir(double valor, Conta destino) throws SaldoInsuficienteException {
		this.sacar(valor);
		destino.depositar(valor);
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
			System.out.println("Não pode valor menor que zero.");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não pode valor menor que zero.");
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
