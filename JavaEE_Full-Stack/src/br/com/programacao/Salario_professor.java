package br.com.programacao;

import java.util.Scanner;

public class Salario_professor {

	public static void main(String[] args) {

		double salario;
		double horaAula;
		int nAulas;
		double inss = 0.08;
		double salario_liquido;
		double taxa_inss;

		Scanner e = new Scanner(System.in);

		System.out.println("Digite o valor da hora aula:");
		horaAula = e.nextDouble();
		System.out.println("Digite a quantidade de Numero de aulas:");
		nAulas = e.nextInt();

		salario = (horaAula * nAulas);
		taxa_inss = salario * inss;
		salario_liquido = salario - taxa_inss;

		System.out.println("O valor bruto do salario é R$ : " + salario + "" + ", o desconto do INSS é:R$ " + taxa_inss
				+ " o Salario a receber será: R$" + salario_liquido);

	}

}
