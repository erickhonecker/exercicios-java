package br.com.programacao;

import java.util.Scanner;

public class validador_informacoes {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		String nome, sexo, estado_civil;
		int idade;
		double salario;

		// Valida��o de nome implementada
		System.out.println("Digite seu nome:");
		nome = e.next();
		while (nome.length() < 3) {
			System.out.println("Nome deve ter no m�nimo 3 caracteres!\n");
			System.out.println("\n Digite seu nome corretamente:");
			nome = e.next();

		}

		// Implementa��o do validador de idade
		System.out.println("\n Digite sua idade: ");
		idade = e.nextInt();
		while (idade < 0 || idade > 150) {

			System.out.println("Idade fora da realidade! \n");
			System.out.println("\n Digite sua idade corretamente: ");
			idade = e.nextInt();
		}

		// Implementa��o valida��o do Sal�rio
		System.out.println("\n Digite seu Sal�rio: ");
		salario = e.nextDouble();
		while (salario < 0) {

			System.out.println("Salario inexistente! \n");
			System.out.println("\n Digite o valor do Sal�rio corretamente:\n ");
			salario = e.nextDouble();

		}

		// Implementa��o da valida��o de sexo
		System.out.println("\n Digite F para Feminino ou M para Masculino.");
		sexo = e.next().toUpperCase();

		while (!sexo.equals("M") && !sexo.equals("F")) {

			System.out.println(" Sexo Incorretamente!\n");
			System.out.println("\n Digite F para Feminino ou M para Masculino.\n");
			sexo = e.next().toUpperCase();

		}

		System.out.println("\n Informe seu estado civil:  C para casado(a), S = solteiro(a), V = vi�vo(a), D = divorciado(a).\n");
		estado_civil = e.next().toUpperCase();
		while (!estado_civil.equals("C") && !estado_civil.equals("S") && !estado_civil.equals("V")
				&& !estado_civil.equals("D")) {

			System.out.println("Digite conforme as op��es informada!\n");
			System.out.println("\n Informe seu estado civil:  C para casado(a), S = solteiro(a), V = vi�vo(a), D = divorciado(a).\n\n");
			estado_civil = e.next().toUpperCase();

		}

		//Imprimindo informa��es fornecidas
		System.out.println("\n");
		System.out.println("Seu nome �: " + nome + "");
		System.out.println("Sua Idade �: " + idade + " anos");
		System.out.println("Seu Sal�ario �: R$" + salario + "");

		switch (sexo) {
		case "M":
			System.out.println("Seu Sexo �: Masculino");

			break;
		case "F":
			System.out.println("Seu Sexo �: Feminino");

			break;
		}

		switch (estado_civil) {
		case "C":
			System.out.println("Estado Civil: Casado(a)");

			break;
		case "S":
			System.out.println("Estado Civil: Solteiro(a)");

			break;

		case "V":
			System.out.println("Estado Civil: Vi�vo(a)");

			break;
		case "D":
			System.out.println("Estado Civil: Divorciado(a)");

			break;

		}

	}

}
