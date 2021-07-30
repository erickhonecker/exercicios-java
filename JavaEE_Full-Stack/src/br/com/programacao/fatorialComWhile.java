package br.com.programacao;

import java.util.Scanner;

public class fatorialComWhile {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int fatorial;
		int opcao = 1;
		while (opcao == 1) {
			System.out.println("Digite 1 ou 0:");
			opcao = e.nextInt();
			while (opcao != 0 && opcao <= 1) {
				System.out.println("Digite 0 ou 1");
				opcao = e.nextInt();

			}
			if (opcao != 0) {

				// aqui vai o fatorial
			}
		}

	}

}
