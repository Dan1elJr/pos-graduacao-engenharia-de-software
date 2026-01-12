package main.java.abstracao;

public class Poupanca extends Conta {

	@Override
	public void imprimeExtrato() {
		
		System.out.println("Saldo "+ this.getSaldo());
		
	}
		
}
