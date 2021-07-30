package br.com.matrizes;

import java.util.Random;

public class diagonalTeste {

	public static void main(String[] args) {
		int mat[][] = new int[10][10];
		Random e = new Random();

		
		System.out.println("\n");
		System.out.println("\n \n  Não Imprimir diagonal principal: ");
		for(int i = 0; i< mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = e.nextInt(10);
				if(i == j) {
					System.out.print("  ");
				}else {
					System.out.print(" "+ mat[i][j]+ " ");
				}
				
			}
			System.out.println(" ");
			
		}
	
	
	}
}