package br.com.programacao;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		double base, altura, area;

		Scanner e = new Scanner(System.in);

		System.out.println("Digite a base:");
		base = e.nextDouble();

		System.out.println("Digite a altura:");
		altura = e.nextDouble();

		if (altura < 0 || base < 0) {
			System.out.println("Erro! Área parametros negativos.");

		}
		if (altura > 0 && base > 0) {

			area = 0.5 * base * altura;
			System.out.println("A área vale: " + area);

		}

	}

}
