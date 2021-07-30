package br.com.programacao;

import java.util.Scanner;

public class impar_ou_par {

	public static void main(String[] args) {
		int num;

		Scanner e = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		num = e.nextInt();
		
		
		
		if( (num%2) == 0){
			System.out.println("é par");
			
		}else{
			System.out.println(" é impar");
		}

	}

}
