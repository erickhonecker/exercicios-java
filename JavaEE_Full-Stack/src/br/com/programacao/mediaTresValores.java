package br.com.programacao;

import java.util.Scanner;

public class mediaTresValores {

	public static void main(String[] args) {

		double valor1;
		double valor2;
		double valor3;
		double soma;

		Scanner e = new Scanner(System.in);

		System.out.println("Digeite o primeiro número: ");
		valor1 = e.nextDouble();
		System.out.println("Digite o segundo número: ");
		valor2 = e.nextDouble();
		System.out.println("Digite o terceiro número: ");
		valor3 = e.nextDouble();

		soma = (valor1 + valor2 + valor3);

		if (soma > 50) {

			System.out.println("Soma é maior que ciquenta");
		} else {
			System.out.println("Soma é menor que ciquenta");
		}
	}

}
