package br.com.programacao;

import java.util.Scanner;

public class aluno_nota {

	public static void main(String[] args) {
		
		double nota;
		int loop = 0;
		
		Scanner e = new Scanner(System.in);
		
		do{
			
		System.out.println("Digite sua nota entre 0 e 10 : ");
		nota = e.nextDouble();
			
		if(nota > 0 && nota <= 10){
			
			System.out.println(" Essa é sua nota: " + nota);
			
			break;
		}
			
			System.out.println("Você digitou valores invalidos!\n");
			
		}while(nota < 0 || nota > 10);
		
		
	}

}
