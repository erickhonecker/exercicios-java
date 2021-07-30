package br.com.programacao;

import java.util.Scanner;

public class controleGasto {

	public static void main(String[] args) {

		double valorCarteira;
		double valorGastar;

		Scanner e = new Scanner(System.in);

		System.out.println("Digite o valor que você possui em conta: R$");
		valorCarteira = e.nextDouble();

		System.out.println("Digite quanto você pretende gastar: R$");
		valorGastar = e.nextDouble();

		if (valorCarteira >= valorGastar) {
			System.out.println("Você tem saldo suficiente! Aproveite as Compras.");

		} else {
			System.out.println("Você não tem dinheiro suficiente! Economize mais.");
		}
	}

}
