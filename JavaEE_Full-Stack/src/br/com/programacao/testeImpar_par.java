package br.com.programacao;

import java.util.Scanner;

public class testeImpar_par {

	public static void main(String[] args) {
		int a = 0, resto;
		Scanner e = new Scanner(System.in);

		while (a >= 0) {
			System.out.println("digite um numero");
			resto = e.nextInt();
			
			resto = (a % 2);
			if (resto == 0) {
				System.out.println("É par");
			} else if (a < 0) {
				System.out.println("Numero negativo");
			} else {
				System.out.println("é impar");
			}

		}
	}

}
