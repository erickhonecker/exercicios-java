package br.com.programacao;

import java.util.Scanner;

public class situacaoAluno {

	public static void main(String[] args) {

		String nome;
		double nota;

		Scanner e = new Scanner(System.in);
		System.out.println("Digite seu Nome: ");
		nome = e.next();

		System.out.println("Digite a nota:  ");
		nota = e.nextDouble();

		if (nota >= 7) {
			System.out.println(nome + " Você foi Aprovado com Média: " + nota);
		} else {

			System.out.println(nome + " Você foi rerovado com Média: " + nota);
		}

	}

}
