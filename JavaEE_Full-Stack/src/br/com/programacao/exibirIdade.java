package br.com.programacao;

import java.util.Scanner;

public class exibirIdade {

	public static void main(String[] args) {

		int idade;

		Scanner e = new Scanner(System.in);
		System.out.println("Digite sua idade:");
		idade = e.nextInt();

		System.out.println("Sua idade é " + idade);

	}

}
