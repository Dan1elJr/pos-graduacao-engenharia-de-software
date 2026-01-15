package main.java.colecoes.hashset;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class App {
	
	public static void main (String []args) {
		
		HashSet<Integer> numeros = new HashSet<>();
		numeros.add(2);
		numeros.add(5);
		numeros.add(8);
		numeros.add(10);
		numeros.add(20);
		
		numeros.forEach(System.out::println);
		
		
	}
	
}
