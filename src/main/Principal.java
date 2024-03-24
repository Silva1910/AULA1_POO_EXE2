package main;

import model.ContaBancaria;
public class Principal {


	public static void main (String args[]) {
ContaBancaria c = new ContaBancaria();	
	
c.setNome("amos");
c.setNumeroConta(7);

c.realizarDeposito(1000);
c.realizarSaque(500);



System.out.println("o nome do cliente é  " + c.getNome()  + "  e o numero da conta e  " + c.getNumeroConta() + " o valor final da conta e  " + c.getSaldo());
}
	
}
