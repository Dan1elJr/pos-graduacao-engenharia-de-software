package main.java.colecoes.treeset;

import java.util.TreeSet;

public class App {
	public static void main (String []args) {
		
		TreeSet<Integer> numeros= new TreeSet<>();
		
		numeros.add(10);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		
		System.out.println(numeros);
		
		boolean result = numeros.remove(8);
		
		System.out.println("Has the number been removed? "+result);
		System.out.println(numeros);
		
	}
}
