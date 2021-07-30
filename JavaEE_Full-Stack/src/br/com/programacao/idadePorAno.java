package br.com.programacao;

import java.util.Scanner;

public class idadePorAno {

	public static void main(String[] args) {
		int anoNasc;
		int anoAtual = 2019;
		int idade;

		Scanner e = new Scanner(System.in);

		System.out.println("Digite o seu ano de nascimento: ");
		anoNasc = e.nextInt();

		idade = anoAtual - anoNasc;

		System.out.println("\nSua idade é exatamente: " + idade + " Anos \n");
		System.out.println("Sua idade em 2020 será: " + (idade + 1) + " Anos");
	}

}
