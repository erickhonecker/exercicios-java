package br.com.matrizes;

import java.util.Random;

public class imprimir_triangulo_acima_da_diagonal_principal {

	public static void main(String[] args) {
		int mat[][] = new int[5][5];
		Random ale = new Random();

		System.out.println(" Matriz: \n");
		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {
				mat[l][c] = ale.nextInt(10);
				System.out.print("  " + mat[l][c] + "  ");
			}
			System.out.println(" ");
		
		}
		System.out.println(" \n \n Triângulo Acima da diagonal principal: \n");
		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {
				mat[l][c] = mat[l][c]; 
				if( l < c) {
				System.out.print("  "+ mat[l][c] +"  ");
				}else {
					System.out.print("     ");
				}
			}
			System.out.println("    ");

		}
	}

}
