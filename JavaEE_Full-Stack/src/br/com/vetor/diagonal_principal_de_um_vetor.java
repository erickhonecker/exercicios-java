package br.com.vetor;

import java.util.Scanner;

public class diagonal_principal_de_um_vetor {
	public static void main(String[] args) {
		int n;

		Scanner e = new Scanner(System.in);

		System.out.println("Informe um número: ");
		n = e.nextInt();
				for(int i = 0; i < n; i++){
					for(int j = 0; j < n; j++){
						if (i > j){
							System.out.print("  "+i+"-"+j+"  ");
						}else{
							System.out.print("      ");
						}
					}
					System.out.println("    ");
				}
	}

}