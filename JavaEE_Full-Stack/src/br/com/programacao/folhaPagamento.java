package br.com.programacao;

import java.util.Scanner;

public class folhaPagamento {

	public static void main(String[] args) {

		int qtdFunc;
		double salario, mediaSalario;
		int control = 1;
		double somaSalario = 0, acumulador = 0;
		Scanner e = new Scanner(System.in);

		System.out.println("Digite o numero de Funcionarios: ");
		qtdFunc = e.nextInt();
		while (control <= qtdFunc) {
			System.out.println("Digite o salario do " + control + "� funcion�rio:");
			salario = e.nextDouble();

			somaSalario += salario;
			control++;
			acumulador = somaSalario;

		}

		System.out.println("A soma dos salarios �: R$" + acumulador);
		mediaSalario = acumulador / qtdFunc;
		System.out.println("A m�dia Salarial �: R$" + mediaSalario);

	}

}
