package br.com.programacao;

import java.util.Random;
import java.util.Scanner;

public class numeros_aleatorio {
	
	public  static void meu_sorteio(int num_sorteio, int max){
		Random e = new Random();
		for(int i =0; i< num_sorteio; i++){
			max = e.nextInt();
			System.out.println(max);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		int num_sorteio, max;
		
		System.out.println("Digite o numero de sorteios");
		num_sorteio =  e.nextInt();
		
		
		System.out.println("Qual o maior número a ser sorteado? ");
		max = e.nextInt();
		
	    meu_sorteio(num_sorteio, max );
		
		
	}

}
