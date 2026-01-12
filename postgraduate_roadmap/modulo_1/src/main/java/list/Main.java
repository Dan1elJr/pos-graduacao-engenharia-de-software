package main.java.list;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> nome = new ArrayList<>();
		
		nome.add("Damaris");
		nome.add("Daniel");
		nome.add("Shyrleimara");
		
		nome.forEach(System.out::println);
	}

}
