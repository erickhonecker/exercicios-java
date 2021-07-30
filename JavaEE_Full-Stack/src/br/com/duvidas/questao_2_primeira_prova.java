package br.com.duvidas;
import java.util.Scanner;

public class questao_2_primeira_prova {

	public static void main(String[] args) {
		int a, b, i, operacao;

		Scanner e = new Scanner(System.in);
		System.out.println("Digite o primeiro numero");
		a = e.nextInt();
		System.out.println("digite o segundo numero");
		b = e.nextInt();

		for (i = 0; i < 4; i++) {
			if ((i) % 2 == 0) {
				operacao = a + b;
				a = b;
				b = operacao;
				System.out.println(operacao);
			} else {
				operacao = a - b;
				a = b;
				b = operacao;
				System.out.println(operacao);

			}
		}

	}

}
