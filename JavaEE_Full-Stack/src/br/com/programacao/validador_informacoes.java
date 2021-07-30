package br.com.programacao;

import java.util.Scanner;

public class validador_informacoes {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		String nome, sexo, estado_civil;
		int idade;
		double salario;

		// Validação de nome implementada
		System.out.println("Digite seu nome:");
		nome = e.next();
		while (nome.length() < 3) {
			System.out.println("Nome deve ter no mínimo 3 caracteres!\n");
			System.out.println("\n Digite seu nome corretamente:");
			nome = e.next();

		}

		// Implementação do validador de idade
		System.out.println("\n Digite sua idade: ");
		idade = e.nextInt();
		while (idade < 0 || idade > 150) {

			System.out.println("Idade fora da realidade! \n");
			System.out.println("\n Digite sua idade corretamente: ");
			idade = e.nextInt();
		}

		// Implementação validação do Salário
		System.out.println("\n Digite seu Salário: ");
		salario = e.nextDouble();
		while (salario < 0) {

			System.out.println("Salario inexistente! \n");
			System.out.println("\n Digite o valor do Salário corretamente:\n ");
			salario = e.nextDouble();

		}

		// Implementação da validação de sexo
		System.out.println("\n Digite F para Feminino ou M para Masculino.");
		sexo = e.next().toUpperCase();

		while (!sexo.equals("M") && !sexo.equals("F")) {

			System.out.println(" Sexo Incorretamente!\n");
			System.out.println("\n Digite F para Feminino ou M para Masculino.\n");
			sexo = e.next().toUpperCase();

		}

		System.out.println("\n Informe seu estado civil:  C para casado(a), S = solteiro(a), V = viúvo(a), D = divorciado(a).\n");
		estado_civil = e.next().toUpperCase();
		while (!estado_civil.equals("C") && !estado_civil.equals("S") && !estado_civil.equals("V")
				&& !estado_civil.equals("D")) {

			System.out.println("Digite conforme as opções informada!\n");
			System.out.println("\n Informe seu estado civil:  C para casado(a), S = solteiro(a), V = viúvo(a), D = divorciado(a).\n\n");
			estado_civil = e.next().toUpperCase();

		}

		//Imprimindo informações fornecidas
		System.out.println("\n");
		System.out.println("Seu nome é: " + nome + "");
		System.out.println("Sua Idade é: " + idade + " anos");
		System.out.println("Seu Saláario é: R$" + salario + "");

		switch (sexo) {
		case "M":
			System.out.println("Seu Sexo é: Masculino");

			break;
		case "F":
			System.out.println("Seu Sexo é: Feminino");

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
			System.out.println("Estado Civil: Viúvo(a)");

			break;
		case "D":
			System.out.println("Estado Civil: Divorciado(a)");

			break;

		}

	}

}
