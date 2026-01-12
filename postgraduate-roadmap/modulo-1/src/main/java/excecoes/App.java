package main.java.excecoes;

import java.util.Scanner;

public class App {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite um valor");
			
			int numero1 = sc.nextInt();
			
			System.out.println(numero1);
		
		}
		catch(Exception exc) {
			System.out.println("ERRO - Valor inserido está incorreto");
		}
		finally {
			sc.close();
		}
		
	}
}
