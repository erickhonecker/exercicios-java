package br.com.matrizes;

public class Exer_1_matrizes {

	public static void main(String[] args) {
		int matA[][] = {{2,3,4,5,6}, {7,8,9,10,11},{12,13,14,15,16}}; 
		int matB[][] = {{2,3,4,5,6}, {7,8,9,10,11},{12,13,14,15,16}}; 
		int soma[][] = new int [3][5];
		
		
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 5; c++) {
				
				soma[l][c] = matA[l][c] + matB[l][c];
				System.out.print(soma[l][c]+ " ");
				
			}
			System.out.println(" ");
			
		}
	}

}
