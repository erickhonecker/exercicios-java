package br.com.matrizes;

import java.util.Random;

public class imprimir_tudo_exceto_diagonal_principal {

	public static void main(String[] args) {
		int mat [][] = new int[5][5];
		Random ale = new Random();

		System.out.println("\n");
		System.out.println("\n \n  Não Imprimir diagonal principal: ");
		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {
				mat[l][c] = ale.nextInt(10);
				if( l == c) {
					System.out.print("     ");
				
				}else {
					System.out.print("  " + mat[l][c] + "  ");
				}
			}
			System.out.println("   ");
		}
	}

}

