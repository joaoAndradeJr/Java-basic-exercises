package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, result;
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		result = n1 + n2;
		System.out.printf("SOMA = " + result);
		
		sc.close();
	}

}
