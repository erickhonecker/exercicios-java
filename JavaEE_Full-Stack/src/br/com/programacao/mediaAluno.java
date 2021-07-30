package br.com.programacao;

import java.util.Scanner;

public class mediaAluno {
	public static void main(String[] args) {

		String nome;
		double nota1;
		double nota2;
		double media;

		Scanner e = new Scanner(System.in);
		System.out.println("Digite seu Nome: ");
		nome = e.next();

		System.out.println("Digite a 1° nota:  ");
		nota1 = e.nextDouble();

		System.out.println("Digite a 2° nota: ");
		nota2 = e.nextDouble();

		media = (nota1 + nota2) / 2;

		if (media >= 7 && media <= 10) {
			System.out.println(nome + " Você foi Aprovado com Média: " + media);
		} else if (media <= 7) {

			System.out.println(nome + " Você foi rerovado com Média: " + media);

		} else {
			System.out.println("Nota Invalida");
		}
	}

}
