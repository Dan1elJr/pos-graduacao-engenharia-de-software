package main.java.colecoes.linkedlist;

import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		
		LinkedList<String>linkedList = new LinkedList<>();
		
		linkedList.add("Daniel");
		linkedList.add("Carlos");
		linkedList.add("José");
		
		linkedList.forEach(System.out::println);
		
		
	}

}
