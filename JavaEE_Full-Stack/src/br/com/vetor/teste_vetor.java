package br.com.vetor;

public class teste_vetor {

	public static void main(String[] args) {
		   int[] arrayBase; 
		   arrayBase = new int[ 20 ]; 
		   System.out.printf("%s %10s \n", "Index", "Valores"); 
		   //GERA A SAÍDA DO VALOR DE CADA ELEMENTO DO ARRAY 
		   for(int i = 0; i < arrayBase.length; i++) 
		    System.out.printf("%3d %10d \n", i, arrayBase[ i ]); 
		   } 
		
	}


