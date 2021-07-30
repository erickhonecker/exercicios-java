package br.com.matrizes;

import java.util.Random;

public class matriz_completa {

	public static void main(String[] args) {
		int mat[][] = new int[5][5];
		Random ale = new Random();

		System.out.println(" Matriz Principal: \n");
		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {
				mat[l][c] = ale.nextInt(10);

				System.out.print(" " + mat[l][c] + " ");
			}
			System.out.println(" ");
		}

	}
}
