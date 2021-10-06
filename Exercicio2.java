package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float area, raio;
		float pi = 3.14159f;
		
		raio = sc.nextFloat();
		
		area = (float) (pi * (Math.pow(raio, 2)));
		
		System.out.printf("A = %.4f", area);
		
		sc.close();
	}

}
