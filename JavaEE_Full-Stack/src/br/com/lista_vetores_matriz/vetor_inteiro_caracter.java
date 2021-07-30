package br.com.lista_vetores_matriz;

import java.util.Scanner;

public class vetor_inteiro_caracter {

	public static void main(String[] args) {

		int n;
		Scanner e = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor:");
		n = e.nextInt();
		int vetor[] = new int[n];
		String caracter[] = new String[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um vetor de inteiro[" + i + "];");
			vetor[i] = e.nextInt();
			System.out.println("Digite o vetor de caracter[" + i + "];");
			caracter[i] = e.next();

		}

		for (int j = 0; j < vetor.length; j++) {
			for(int i = 0; i < vetor[j]; i++){
				
				System.out.println("Imprimindo o caracter: "+ caracter[j]);

			}
			
		}
	}

}
