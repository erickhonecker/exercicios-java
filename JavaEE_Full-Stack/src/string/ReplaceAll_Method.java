package string;

import java.util.Scanner;

public class ReplaceAll_Method {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		String texto; 
		
		System.out.println("Digite seu texto: ");
		 texto = e.nextLine();
		 
		 // remove todos os espaços contino texto! são passados dois parâmentros, replaceAll("o que vai remover ", "o que vai substituir") 
		 System.out.println(texto.replaceAll("\\s+", ""));
		 
		
		
	}

}
