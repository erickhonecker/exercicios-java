package br.com.lista_vetores_matriz;

import java.util.Scanner;

public class multiplicacao_entre_vetores {

	public static void main(String[] args) {
		int n;
		Scanner e = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor[n]:");
		n = e.nextInt();
		int produto[] = new int[n];
		int vetor[] = new int[n];
		int matriz[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite os valores do vetor[i]:"); 
			vetor[i] = e.nextInt();
			System.out.println("Digite os valores da matriz[i]:");
			matriz[i] = e.nextInt();	
		}
		
		for(int j = 0; j < n; j++) {
			produto[j] = vetor[j] * matriz[j];
			System.out.println("---------- Produto da Multiplica��o --------");
			System.out.println(" Calcule o produto de: \n vetor["+j+"]= "+vetor[j]+ " matriz["+j+"] = " +matriz[j]+"\n"  );
			System.out.println( " R: vetor["+j+"] x matriz["+j+"] = "+ produto[j]+" \n ");	
		}
	
	}

}
