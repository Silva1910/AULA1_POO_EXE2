package model;

public class ContaBancaria {

	private int numeroConta;
	private String nome;
	private double saldo;

	public ContaBancaria() {
		super();
	}

	public double realizarDeposito(double valor) {
		return saldo = saldo + valor;
	}

	public double realizarSaque(double valor) {
	    if (valor < saldo) {
	        saldo = saldo - valor;
	    } else {
	        System.out.println("Saldo menor do que o valor do saque o valor que voce tem disponivel é");
	    }
	    return saldo; 
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
