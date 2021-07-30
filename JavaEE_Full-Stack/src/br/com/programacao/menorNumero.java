package br.com.programacao;

import java.util.Scanner;

public class menorNumero {
	public static void main(String args[]) {
		int a, b;

		Scanner e = new Scanner(System.in);

		System.out.println("Digite um numero");
		a = e.nextInt();
		System.out.println("Digite outro numero:");
		b = e.nextInt();

		if (a < b) {
			System.out.println("O menor numero é : " + a);
		} else if (b < a) {
			System.out.println("O menor numero é : " + b);
		} else {

			System.out.println("Os números são iguais!");
		}

	}

}