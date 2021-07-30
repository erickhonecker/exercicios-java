package br.com.refazer_lista_matriz_vetores;

import java.util.Scanner;

public class menor_dos_elementos_do_vetor {

	public static void main(String[] args) {
		int n, menor = 9999999, maior = 0;
		Scanner e = new Scanner(System.in);
		
		System.out.println("digite o tamanho do vetor");
		n = e.nextInt();
		int vetor[] = new int[n];
		
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("digite o valor do vetor["+ i +"]" );
			vetor[i] = e.nextInt();
			
			
		}
		
		for(int j = 0; j < vetor.length; j++) {
			if(vetor[j] < menor) {
				menor = vetor[j];
			}
			if(vetor[j] > maior) {
				maior = vetor[j];
			}
			
			
		}
		System.out.println(menor);
	}

}
