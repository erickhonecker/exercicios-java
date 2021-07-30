package br.com.programacao;

import java.util.Scanner;

public class dadosPessoa {

	public static void main(String[] args) {

		double media;
		String nome;
		String sexo;

		Scanner e = new Scanner(System.in);

		System.out.println("Digite o seu nome:");
		nome = e.next();

		System.out.println("Digite o seu sexo:");
		sexo = e.next();

		System.out.println("Digite sua Média");
		media = e.nextDouble();

		if (sexo.toUpperCase().equals("MASCULINO") && media >= 7) {

			System.out.println(nome + " Você foi aprovado");

		} else if (sexo.toUpperCase().equals("MASCULINO") && media <= 7) {

			System.out.println(nome + " Você foi Reprovado");

		} else if (sexo.toUpperCase().equals("FEMININO") && media >= 7) {
			System.out.println(nome + " Você foi aprovada");

		} else if (sexo.toUpperCase().equals("FEMININO") && media <= 7) {

			System.out.println(nome + " Você foi Reprovada");

		} else {
			System.out.println("Valores invalidos");
		}

	}

}
