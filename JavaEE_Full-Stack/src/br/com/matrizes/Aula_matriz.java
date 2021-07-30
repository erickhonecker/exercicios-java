package br.com.matrizes;

public class Aula_matriz {

	public static void main(String[] args) {

		
		int nota[][] = {{1,2,3}, {4,5,6},{7,8,9}};
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(nota[i][j]);
				
			}
			System.out.println(" ");
		}
	}

}
