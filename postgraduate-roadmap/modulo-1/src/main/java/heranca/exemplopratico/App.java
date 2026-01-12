package main.java.heranca.exemplopratico;

public class App {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		Gato gato = new Gato();
		
		cachorro.setNome("Rex");
		gato.setNome("Garfield");
		
		gato.mostrar();
		gato.Comer();
		
		cachorro.mostrar();
		cachorro.Comer();
	}

}
