package main.java;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {

	public static void main(String[] args) {
		
		Random generator = new Random();
		int getGenetorValue = generator.nextInt(100);
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Advinhe o numero que estou pensando");
		int number = sc.nextInt();
		
		
		if (number == getGenetorValue) {
			System.out.println("Parabéns, você acertou, eu pensei no: " + getGenetorValue);
			
		}
		else {
			System.out.println("Você errou, eu pensei no: " + getGenetorValue);
		}
		
		
		
		
		
		
		
		sc.close();
	}

}
