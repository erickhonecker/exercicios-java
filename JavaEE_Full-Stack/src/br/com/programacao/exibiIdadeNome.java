package br.com.programacao;

import java.util.Scanner;

public class exibiIdadeNome {

	public static void main(String[] args) {

		int idade;
		String nome;

		Scanner e = new Scanner(System.in);
		System.out.println("Digite sua idade:");
		idade = e.nextInt();
		System.out.println("Digite seu Nome: ");
		nome = e.next();

		System.out.println("Sua Idade é: " + idade);
		System.out.println("Seu Nome é: " + nome);

	}

}
