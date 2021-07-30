package br.com.lista_vetores_matriz;

import java.util.Scanner;

public class vetor_crescente_1_decrescente_0 {

	public static void main(String[] args) {

		int vetor[] = new int[5];
		int x = 0;
		
		Scanner e = new Scanner(System.in);
		
		for(int i = 0;i < 5;i++){
			vetor[i] = e.nextInt();
		}
		
		
		for(int i = 0;i < 4;i++){
			if(vetor[i] > vetor[i+1]){
				x = 1;
			}else{
				x = 0;
			}
		}
		System.out.println(" ");
		if(x == 1){
			System.out.println(x);
		}else{
			x = 0;
			System.out.println(x);
		}
		
	}

}