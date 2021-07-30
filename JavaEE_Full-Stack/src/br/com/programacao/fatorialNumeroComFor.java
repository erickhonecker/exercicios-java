package br.com.programacao;

import java.util.Scanner;

public class fatorialNumeroComFor {

	public static void main(String[] args) {

		int n;
		int fatorial = 1;
		Scanner e = new Scanner(System.in);
		System.out.println("Digite o valor: ");
		n = e.nextInt();

		if (n < 0) {
			System.out.println("Erro! Valor  negativo. ");

		}
		for (int i = 1; i <= n; i++) {
			fatorial = fatorial * i;

			System.out.println(fatorial);

		}

	}
}