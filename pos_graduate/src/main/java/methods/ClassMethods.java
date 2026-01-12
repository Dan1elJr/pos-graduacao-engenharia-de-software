package main.java.methods;

public class ClassMethods {

	public static void main(String[] args) {
		
		Cao cachorro = new Cao();
		
		cachorro.setIdade(9);
		
		if(cachorro.verificarIdade()) {
			System.out.println("Ele é idoso");
		}
		else {
			System.out.println("Ele é jovem");
		}

	}

}
