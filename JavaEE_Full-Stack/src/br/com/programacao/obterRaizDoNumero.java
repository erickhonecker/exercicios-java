package br.com.programacao;

import java.math.BigDecimal;
import java.util.Scanner;

public class obterRaizDoNumero {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);

		int num;
		int raiz;
		int quadrado;

		System.out.println("Digite um numero:");
		num = e.nextInt();

		if (num < 0) {
			quadrado = num * num;
			System.out.println(quadrado);

		} else if (num > 0) {

			raiz = (int) Math.sqrt(num);
			System.out.println(raiz);

		}

	}

}
