package main.java.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
	
	public static void main(String [] args) {
		
		List<Integer> numero = new ArrayList<>();
		
		numero.add(1);
		numero.add(2);
		numero.add(3);
		
		Iterator<Integer> iterator = numero.iterator();
		
		System.out.println(iterator.hasNext());
		System.out.println(iterator.next());
		
		while(iterator.hasNext()) {
		 iterator.forEachRemaining((value)->System.out.print(value+", "));
		}
		
		//Reference methods
		//iterator.forEachRemaining(System.out::println);
		
		
	}
	
}
