package br.com.programacao;

import java.util.Scanner;

public class soma {

	public static void main(String[] args) {

		Scanner i = new Scanner(System.in);

		double nota1, nota2, nota3, nota4;
		int falta;
		String nome;

		System.out.println("Por favor Digite o Nome do Aluno:");
		nome = i.nextLine();

		System.out.println("Digite a priemira nota do Aluno: ");
		nota1 = i.nextDouble();

		System.out.println("Digite a segunda nota do Aluno: ");
		nota2 = i.nextDouble();

		System.out.println("Digite a quantidade de Faltas do Aluno:");
		falta = i.nextInt();

		double soma = (nota1 + nota2) / 2;

		if (soma >= 7 && falta < 10) {
			System.out.println("Parabéns, " + nome + "! Você foi aprovado sua média foi: " + soma);

		} else if (soma >= 7 && falta > 10) {

			System.out.println(
					nome + ", Infelizmente você foi aprovado por média:" + soma + ", e reprovado por falta: " + falta);
		}
	}
}
