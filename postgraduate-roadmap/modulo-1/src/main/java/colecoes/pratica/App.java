package main.java.colecoes.pratica;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<String> linguagensDaProgramacao = new ArrayList<>();
		
		linguagensDaProgramacao.add("Java");
		linguagensDaProgramacao.add("CSharp");
		linguagensDaProgramacao.add("Python");
		linguagensDaProgramacao.add("JavaScript");
		
		System.out.println("ArrayList: "+linguagensDaProgramacao);
		
		String []arr = new String[linguagensDaProgramacao.size()];
		
		linguagensDaProgramacao.toArray(arr);
		
		for(String itens : arr ) {
			System.out.println(itens);
		}

	}

}
