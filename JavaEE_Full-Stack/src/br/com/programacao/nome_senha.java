package br.com.programacao;

import java.util.Scanner;

public class nome_senha {

	public static void main(String[] args) {
		String nome, senha; 
		
		Scanner e = new Scanner(System.in);
		
		
		
		do{		
			System.out.println("Informe seu nome:");
			nome = e.next();
			System.out.println("Digite sua senha:");
			senha = e.next();
			
			if(!senha.equals(nome)){
				System.out.println("Usúario e senha salvos com sucesso!\n");
				break;
			}
			System.out.println("Usúario e senha são iguais, digite novamente!\n");
		}while(senha.equals(nome));
			
		
	}
		
		
		
	}


