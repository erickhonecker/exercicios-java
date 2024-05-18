package br.com.lista_vetores_matriz;

import java.util.Scanner;

public class vetor_crescente_1_decrescente_0 {

	public static void main(String[] args) {

		int vetor[] = new int[5];
		int x = 0;
		
		Scanner e = new Scanner(System.in);
		for(int i = 0;i < 5;i++){
			System.out.println("Digite um valor na ordem crescente ou decrescente");

			vetor[i] = e.nextInt();
		}
		
		
		for(int i = 0;i < 4;i++){
			if(vetor[i] > vetor[i+1]){
				x = 0;
			}else{
				x = 1;
			}
		}
		System.out.println(" ");
		if(x == 1){
			System.out.println("É um valor crescente --> " + x);
		}else{
			x = 0;
			System.out.println("É um valor decrescente --> " + x);
		}
		
	}

}