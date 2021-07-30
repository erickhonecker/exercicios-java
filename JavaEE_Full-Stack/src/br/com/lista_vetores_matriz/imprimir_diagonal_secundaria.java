package br.com.lista_vetores_matriz;

import java.util.Random;

public class imprimir_diagonal_secundaria {

	public static void main(String[] args) {
		int mat[][] = new int[5][5];
		Random ale = new Random();

		System.out.println("Matriz");
		for (int l = 0; l < mat.length; l++) {

			for (int c = 0; c < mat[l].length; c++) {

				mat[l][c] = ale.nextInt(10);

				System.out.print("  " + mat[l][c] + "  ");

			}
			System.out.println("  ");
		}
		System.out.println("\n Diagonal Secundária \n");
		for (int l = 0; l < mat.length; l++) {

			for (int c = 0; c < mat[l].length; c++) {

				mat[l][c] = mat[l][c];

				if (c + l == mat.length - 1) {

					System.out.print(" " + mat[l][c] + "  ");

				} else {

					System.out.print("   ");
				}
			}
			System.out.println("   ");
		}

	}

}
