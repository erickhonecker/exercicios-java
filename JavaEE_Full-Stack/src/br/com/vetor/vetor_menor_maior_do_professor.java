package br.com.vetor;

import java.util.Scanner;

public class vetor_menor_maior_do_professor {

	public static void main(String[] args) {
			int maior = 0, menor = -99, aux = 0;
			int vetor[] = new int[3];
			Scanner e = new Scanner(System.in);
			System.out.println("Digite um valor: ");
			
			//Preenche o vetor com os valores digitados pelo usuário!!
			for (int i = 0; i < vetor.length; i++) {
				vetor[i] = e.nextInt();

			}
			
			for(int j = 0; j < vetor.length; j++){
				if (vetor[j]>maior){
					maior =vetor[j];
				}
				if(j!=5){
					menor = vetor[j];
					if(vetor[j]>vetor[j+1]){
						menor =vetor[j+1];
					
					}
				}else
					if(vetor[4]<menor){
						menor = vetor[4];
					}
					
				
			}
			System.out.println(" O maior Vetor é:  "+maior);
			System.out.println(" O menor Vetor é:  "+menor);
		}

	
	}


