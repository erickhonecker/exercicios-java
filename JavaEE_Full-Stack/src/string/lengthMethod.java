package string;

import java.util.Scanner;

public class lengthMethod {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		String texto;
		
		
		System.out.println("Digite o texto que voc� que contar as letras: ");
		texto = e.nextLine();
		
		// length � um m�todo da classe String, este m�todo retorna um inteiro com quantidade de caractere do texto.
		System.out.println("O seu texto tem "+texto.length() + " Letras e espa�os!");
		// trim() remove os espa�os no inicio e no final do texto!
		System.out.println("O seu texto tem "+texto.trim().length() + " Letras e espa�os!");
		// replaceAll remove todos espa�os em branco + length que faz a contage de caracter.
		texto.replaceAll("\\s","").length();
		 
	}

}
