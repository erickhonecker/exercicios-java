package br.com.lista_vetores_matriz;

import java.util.Random;

public class vetor_A_e_B_dividir_2_multiplicar_por_3 {

	public static void main(String[] args) {
		int A[][] = new int[10][10];
		int B[][] = new int[10][10];
		Random e = new Random();

		System.out.println("Matriz completa:");
		for (int l = 0; l < A.length; l++) {
			for (int c = 0; c < A[l].length; c++) {
				A[l][c] = e.nextInt(10);
				System.out.print(" " + A[l][c] + " ");
			}
			System.out.println("  ");
		}

		System.out.println("\n Vetor: \n");
		for (int l = 0; l < A.length; l++) {
			for (int c = 0; c < A.length; c++) {

				if ((l + c) % 2 == 0) {
					B[l][c] = ((A[l][c]) / 2);

				}
				if ((l + c) % 2 != 0) {
					B[l][c] = ((A[l][c]) * 3);
				}

				System.out.print(" " + B[l][c] + " ");
			}
			System.out.println("  ");
		}

	}
}
