package br.com.programacao;

import java.util.Scanner;

public class controleGasto {

	public static void main(String[] args) {

		double valorCarteira;
		double valorGastar;

		Scanner e = new Scanner(System.in);

		System.out.println("Digite o valor que voc� possui em conta: R$");
		valorCarteira = e.nextDouble();

		System.out.println("Digite quanto voc� pretende gastar: R$");
		valorGastar = e.nextDouble();

		if (valorCarteira >= valorGastar) {
			System.out.println("Voc� tem saldo suficiente! Aproveite as Compras.");

		} else {
			System.out.println("Voc� n�o tem dinheiro suficiente! Economize mais.");
		}
	}

}
