package br.com.programacao;

import java.util.Scanner;

public class impar_ou_par_solucao {

	public static void main(String[] args) {

		int loop = 0, num;

		Scanner e = new Scanner(System.in);

		while (loop == 0) {
			System.out.println("Digite um numero: ");
			num = e.nextInt();

			if ((num % 2) == 0 && (num % 2) >= 0) {
				System.out.println(num + " é um número par \n");

			} else if (num % 2 != 0 && (num % 2) > 0) {
				System.out.println(num + " é um número impar \n");
			} else if (num % 2 < 0) {
				System.out.println(num + " é um número negativo!");
				break;
			}

		}
	}
}
