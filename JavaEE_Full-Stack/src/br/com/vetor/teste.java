package br.com.vetor;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		
	double nota[];
	double soma = 0;
	nota = new double[3];
	Scanner e = new Scanner(System.in);
	
	
	for(int i = 0; i< 3; i++) {
		nota[i] = e.nextDouble();
		soma+=nota[i];
		
	}
	System.out.println(soma/3);    
	

	}

}
