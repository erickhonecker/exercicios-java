package br.com.lista_vetores_matriz;

import java.util.Scanner;

public class menor_valor_do_vetor {

	public static void main(String[] args) {
		int n, menor = 999, maior = 0;
		Scanner e = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor[n]");
		n = e.nextInt();
		int vetor[] = new int[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o valor do vetor[" + i + "]");
			vetor[i] = e.nextInt();

		}
		for (int j = 0; j < vetor.length; j++) {
			if (vetor[j] < menor) {
				menor = vetor[j];
			}
			if (vetor[j] > maior) {
				maior = vetor[j];
			}			
		}
		System.out.println(menor);
	}
}
