package br.com.lista_vetores_matriz;

import java.util.Random;

public class imprimir_tudo_exceto_diagonal_secundaria {

	public static void main(String[] args) {

		int mat[][] = new int[10][10];
		Random ale = new Random();
		
		System.out.println("Matriz");
		for(int l = 0; l < mat.length; l++) {
			for(int c = 0; c < mat[l].length; c++) {
				mat[l][c] = ale.nextInt(10);
				System.out.print("  "+mat[l][c]+"  ");
 			}
			System.out.println("  ");
		}
		System.out.println("\n Diagonal Secundária \n");
		for(int l = 0; l < mat.length; l++) {
			for(int c = 0; c < mat[l].length; c++) {
				mat[l][c] = mat[l][c];
				 if(c+l == mat[l].length-1){
					 System.out.print("    ");
				 }else {
					 System.out.print(" " + mat[l][c] +  "  ");

				 }
			}System.out.println("   ");
		}
		

	}

}
