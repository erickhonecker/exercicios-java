package br.com.programacao;

import java.util.Scanner;

public class dinheirCarteira {

	public static void main(String[] args) {

		double money;
		double precoRefri;
		double qtdRefri;

		Scanner e = new Scanner(System.in);

		System.out.println("Digite quanto reais voc� tem na carteira: ");
		money = e.nextDouble();

		System.out.println("Digite o Pre�o do Refrigerante:");
		precoRefri = e.nextDouble();

		qtdRefri = money / precoRefri;

		if (qtdRefri > 12) {

			System.out.println("� possivel compra mais que uma grade de refrigerantes!" + " \n voc� pode comprar: "
					+ qtdRefri + " Refrigerantes");
		} else {
			System.out.println("Voc� pode comprar " + qtdRefri + " Refrigerantes. ");

		}

	}

}
