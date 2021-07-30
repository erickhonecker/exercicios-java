package br.com.vetor;
import java.util.Scanner;

public class menor_e_maior_vetor_internet {

	public static void main(String[] args) {

		int maior = 0, menor = 0, aux = 0;
		int vetor[] = new int[5];
		Scanner e = new Scanner(System.in);
		System.out.println("Digite um valor");

		// Preenche o vetor com os valores digitados pelo usuário!!
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = e.nextInt();

		}
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length - 1; j++) {
				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;

				}

			}
		}
		for (int i = 0; i < vetor.length ; i++) {
			System.out.print(vetor[i]);
		}

		System.out.println(" O maior Vetor é:  " + vetor[4]);
		System.out.println(" O menor Vetor é:  " + vetor[0]);
	}
}