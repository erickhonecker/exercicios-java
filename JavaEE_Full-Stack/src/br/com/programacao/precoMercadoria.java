package br.com.programacao;

import java.util.Scanner;

public class precoMercadoria {

	public static void main(String[] args) {

		int preco;
		int promocional;
		Scanner e = new Scanner(System.in);

		System.out.println("Digite o pre�o da mercadoria");
		preco = e.nextInt();

		promocional = preco / 2;

		System.out.println("O Pre�o normal � R$:" + preco + " Pre�o com desconto � R$:" + promocional);

	}

}
