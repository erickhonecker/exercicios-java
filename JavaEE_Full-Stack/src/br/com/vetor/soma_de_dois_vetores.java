package br.com.vetor;

import java.util.Scanner;

public class soma_de_dois_vetores {

	public static void main(String[] args) {
		int vetor[] = new int[2];
		int soma;		
		Scanner e = new Scanner(System.in);
		
		for(int i = 0; i< vetor.length; i++) {
			System.out.println("Digite os vcalores dos vetores:");
			vetor[i] = e.nextInt();			
		}
		
		for(int i = 0; i < vetor.length -1; i++) {				
			soma = vetor[i] + vetor[i+1];
			System.out.println(soma);
		}
		
		
	}

}
