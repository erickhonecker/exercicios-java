package br.com.refazer_lista_matriz_vetores;

import java.util.Scanner;

public class maior_e_menor_vetor {

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
