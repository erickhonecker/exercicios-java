package br.com.lista_vetores_matriz;

import java.util.Random;

public class imprimir_onde_coluna_mais_linha_seja_par {

	public static void main(String[] args) {
		int mat[][] = new int[5][5];
		Random ale  = new Random();

		System.out.println("Matriz Completa:");
		for(int l = 0; l < mat.length; l++) {
			for(int c = 0; c < mat[l].length; c++) {
				mat[l][c] = ale.nextInt(10);
				System.out.print(" "+mat[l][c]+" ");

			}
			System.out.println("  ");
		}
		System.out.println("Matriz --> Coluna + Linha = Par");
		for(int l = 0; l < mat.length; l++) {
			for(int c = 0; c < mat[l].length; c++) {
				mat[l][c] = mat[l][c];
				if(((c+l) & 1) == 0) {
					 System.out.print(""+mat[l][c]+"");
				}else {
					System.out.print("   ");
				}

			}System.out.println("   ");
		}



	}

}
