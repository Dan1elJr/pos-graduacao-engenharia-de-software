package main.java;

import java.util.Scanner;

public class WhileIteration {
	
	public static void main (String [] args) {
		
		int option = 99;
		Scanner sc = new Scanner(System.in);
		
		while(option != 99) {
			
			
			
			System.out.println("Digite um valor qualquer , ou 99 para encerrar");
			
			option = sc.nextInt();
			
			System.out.println("O valor digitado foi: " + option);
				
			
		}
		
		System.out.println("Encerrado!");
		sc.close();
	}
}
