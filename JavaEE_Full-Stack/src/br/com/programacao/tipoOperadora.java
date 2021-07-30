package br.com.programacao;
import java.util.Scanner;

public class tipoOperadora {

	public static void main(String[] args) {
		
		String tipoOperador;
		
		
		Scanner e = new Scanner(System.in);
		
		System.out.println("Digite o código da sua Operadora conforme a tabela abaixo:"
				+ "\n Codigo: N \t   C\t O\t  G\t  V\t "
				+ "\n Nome:  Net \t Claro\t Oi \t GVT \t Vivo");
		
		tipoOperador = e.next();
		switch (tipoOperador.toUpperCase()) {
        case "N": 
        	System.out.println("\n Sua operadora é a: Net");
            break;
        
        case "C": 
        	System.out.println("\n Sua operadora é a: Claro");
            break;
        
        case "O": 
        	System.out.println("\n Sua operadora é a: Oi");
            break;
            
        case "G": 
        	System.out.println("\n Sua operadora é a: GVT");
            break;
        
        case "V": 
        	System.out.println("\n Sua operadora é a: Vivo");
            break;
            
        default:
             System.out.println("Código Operadora Invalido!");
     }
		
		}
	}


