package main.java.interfaces;

public class Poupanca implements Conta {
	
	private double saldo;
	
	@Override
	public void depositar(double valor) {
		this.saldo+=valor;
	}

	@Override
	public void sacar(double valor) {
		if(valor>getSaldo()) {
			System.out.println("Saldo insuficiente");
		}
		else {
			saldo-=valor;
		}	
	}

	@Override
	public double getSaldo() {
		
		return this.saldo;
	}
}