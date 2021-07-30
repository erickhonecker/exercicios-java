package br.com.vetor;

import java.util.Scanner;

public class troca_vetor_par_e_impar {

	public static void main(String[] args) {
		int vetor[] = new int[5];

		Scanner e = new Scanner(System.in);

		System.out.println("Digite os valores a preencher os vetores:");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = e.nextInt();

		}

		for (int i = 0; i < vetor.length; i++) {
			
			System.out.println("Vetor ["+i+"] de valor = " + vetor[i] );
			
			//Condicional que verifica se o vetor na posicão i é ímpar ou par.
			if (vetor[i] % 2 == 0) {
                
				// atribui 0 ao vetor na posiçao i.
				vetor[i] = 0;
				
				System.out.println("New Vetor[" +i+ "] = " + vetor[i]+ "\n");
			
			}else if(vetor[i] % 2 != 0) {
			   vetor[i] = 1;
			   
				System.out.println("New Vetor[" +i+ "] = " + vetor[i]+"\n");
				
			}

		}

	}

}
