package br.com.programacao;

import java.util.Scanner;

public class numero_crescente {

	public static void main(String[] args) {
		int x, y, z;
		Scanner e = new Scanner(System.in);
		System.out.println("Digite um numero 1: ");
		x = e.nextInt();

		System.out.println("Digite outro numero 2: ");
		y = e.nextInt();

		System.out.println("Digite mais outro numero 3: ");
		z = e.nextInt();

		if (x >= y && x >= z && y <= z) {

			System.out.printf(y + "\n" + z + "\n" + x);

		} else if (x <= y && x <= z && y <= z) {

			System.out.println(x + "\n" + y + "\n" + z);

		} else if (x <= y && x >= z && y >= z) {

			System.out.println(z + "\n" + x + "\n" + y);

		} else if (x >= y && x >= z && y >= z) {

			System.out.println(z + "\n" + y + "\n" + x);

		} else if (x >= y && x <= z && y <= z) {

			System.out.println(y + "\n" + x + "\n" + z);

		} else if (x <= y && x <= z && y >= z) {

			System.out.println(x + "\n" + z + "\n" + y);
		}
	}
}
