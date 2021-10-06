package Exercicios;

import java.util.Scanner;

/* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais. */

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int funcionario, horasTrabalhadas;
		double valorHora, salario;
		
		funcionario = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorHora = sc.nextDouble();
		
		salario = (double) horasTrabalhadas * valorHora;
		
		System.out.printf("NUMBER = %d%n", funcionario);
		System.out.printf("SALARY = U$ %.2f%n ", salario);
		
		sc.close();
	}

}
