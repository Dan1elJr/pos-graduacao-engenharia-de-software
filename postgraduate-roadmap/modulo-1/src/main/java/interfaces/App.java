package main.java.interfaces;

public class App {

	public static void main(String[] args) {
		
		Conta cp = new Poupanca();
		
		
		cp.depositar(100);
		
		cp.sacar(99);
		
		
		System.out.println(cp.getSaldo());

	}

}
