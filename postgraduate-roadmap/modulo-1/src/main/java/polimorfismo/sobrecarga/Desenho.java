package main.java.polimorfismo.sobrecarga;

public class Desenho {
	
	public void mostrar() {
		for (int i=0; i<10;i++) {
			System.out.println("*");
		}
	}
	
	//Mostrar com um parâmetro
	public void mostrar (char simb) {
		for(int i=0;i<10;i++) {
			System.out.println(simb);
		}
	}
	
	//Mostrar com dois parâmetros
	public void mostrar (char simb, int n) {
		for(int i=0;i<n;i++) {
			System.out.println(simb);
		}
	}
		
}



