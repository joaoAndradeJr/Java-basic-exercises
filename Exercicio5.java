package Exercicios;

import java.util.Scanner;

/* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. */

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int codPc1, codPc2, pcs1, pcs2;
		double pricePc1, pricePc2, result;
		
		codPc1 = sc.nextInt();
		pcs1 = sc.nextInt();
		pricePc1 = sc.nextDouble();
		
		codPc2 = sc.nextInt();
		pcs2 = sc.nextInt();
		pricePc2 = sc.nextDouble();
		
		result = ((pcs1 * pricePc1) + (pcs2 * pricePc2));
		
		System.out.printf("VALOR A PAGAR: R$ %.2f ", result);
		
		sc.close();
	}

}
