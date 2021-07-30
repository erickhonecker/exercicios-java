package string;

import java.util.Scanner;

public class lengthMethod {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		String texto;
		
		
		System.out.println("Digite o texto que você que contar as letras: ");
		texto = e.nextLine();
		
		// length é um método da classe String, este método retorna um inteiro com quantidade de caractere do texto.
		System.out.println("O seu texto tem "+texto.length() + " Letras e espaços!");
		// trim() remove os espaços no inicio e no final do texto!
		System.out.println("O seu texto tem "+texto.trim().length() + " Letras e espaços!");
		// replaceAll remove todos espaços em branco + length que faz a contage de caracter.
		texto.replaceAll("\\s","").length();
		 
	}

}
