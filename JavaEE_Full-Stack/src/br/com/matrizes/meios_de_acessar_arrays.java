package br.com.matrizes;

import java.util.Random;

public class meios_de_acessar_arrays {

	public static void main(String[] args) {
		int vetor[] = new int[5];
		Random ale = new Random();
		
		System.out.println("vetor:");
		for(int v = 0; v < vetor.length; v++) {
			vetor[v] = ale.nextInt(10);
		}
		for(int elementos : vetor) {
			
			System.out.print(elementos+" ");
		}
	}

}