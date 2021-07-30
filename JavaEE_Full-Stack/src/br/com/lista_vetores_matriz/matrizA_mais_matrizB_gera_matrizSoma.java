package br.com.lista_vetores_matriz;

import java.util.Random;

public class matrizA_mais_matrizB_gera_matrizSoma {

	public static void main(String[] args) {

		int A[][] = new int[4][4];
		int B[][] = new int[4][4];
		int SOMA[][] = new int[4][4];

		Random ale = new Random();

		System.out.println("Matriz 'A' completa:");
		for (int l = 0; l < A.length; l++) {
			for (int c = 0; c < A[l].length; c++) {
				A[l][c] = ale.nextInt(10);
				System.out.print(" " + A[l][c] + " ");

			}
			System.out.println("  ");
		}

		System.out.println(" \n \n Matriz 'B' completa:");
		for (int l = 0; l < B.length; l++) {
			for (int c = 0; c < B[l].length; c++) {
				B[l][c] = ale.nextInt(10);
				System.out.print(" " + B[l][c] + " ");

			}
			System.out.println("  ");
		}
		System.out.println("\n \n Matriz 'SOMA' completa:");
		for(int l = 0; l < SOMA.length; l++) {
			for(int c = 0; c < SOMA[l].length; c++ ) {
				SOMA[l][c] = (A[l][c] + B[l][c]);
				System.out.print(" "+SOMA[l][c] +" ");
				
			}
			System.out.println("  ");
		}
		
	}
	
}
