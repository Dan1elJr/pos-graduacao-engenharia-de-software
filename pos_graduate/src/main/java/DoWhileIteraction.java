package main.java;

import java.util.Scanner;

public class DoWhileIteraction {

	public static void main(String[] args) {
		
		int option;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero qualquer , ou 99 pra encerrar");
			option = sc.nextInt();
			
			
		}while(option!=99);
		
		System.out.println("Encerrado");
		
		sc.close();
	}

}
