package main.java;

import java.util.Scanner;

public class MethodsDemo {
	
	public static void main(String [] args) {
		
		int valor1, valor2,total;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculadora de soma");
		System.out.println("Informe 2 valores para somar");
		valor1 = sc.nextInt();
		valor2 = sc.nextInt();
		total = somar(valor1,valor2);
		System.out.println("O valor da soma é: "+ total);
		
		
		sc.close();
	}
	
	private static int somar(int valor1, int valor2) {
		
		return valor1 + valor2;
	}
}
