package br.com.vetor;

import java.util.Scanner;

public class inverter_arrays {

	public static void main(String[] args) {
		 int n;
		
		 Scanner  e = new Scanner(System.in);
		 
		System.out.println("Digite o número correspondente ao tamanho do vetor:");
		n = e.nextInt();
		int valor[] = new int[n];
	
		    for(int i = 0; i < n; i++) {
		    	System.out.println("digite o valor"+i+ "=");
		    	valor[i] = e.nextInt();
		    }
		  for(int i=n-1; i>=0; i++){
			  System.out.println(i);
		  }
	}

}
