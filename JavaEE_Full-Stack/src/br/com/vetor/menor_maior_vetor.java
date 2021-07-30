package br.com.vetor;

import java.util.Scanner;

public class menor_maior_vetor {

	public static void main(String[] args) {
		
			int maior = 0, menor = 99;
			int vetor[] = new int[5];
			Scanner e = new Scanner(System.in);
			System.out.println("Digite um valor: ");

			//Preenche o vetor com os valores digitados pelo usuário!!
			for (int i = 0; i < vetor.length; i++) {
				vetor[i] = e.nextInt();

			}
			//
			for(int j = 0; j < vetor.length; j++){
				//encontra o maior vetor
				if (vetor[j]>maior){
					maior = vetor[j];
				}
				if(j!=5){
					//encontra o menor vetor
					if(vetor[j] < menor) {
					menor = vetor[j];
					}else
						//se o vetor[4] for o menor, menor recebe vetor[4].
					if(vetor[4]<menor){
						menor = vetor[4];
					}
			}
			}
			System.out.println(" O menor Vetor é:  "+menor);
			System.out.println(" O maior Vetor é:  "+maior);
		
	}
}

