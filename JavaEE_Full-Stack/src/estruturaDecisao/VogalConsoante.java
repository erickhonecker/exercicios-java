package estruturaDecisao;

import java.util.Scanner;

public class VogalConsoante {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		String letra;
		
		
		System.out.println("Digite apenas uma letra pra ser indentifica! -->");
		letra = e.nextLine();
		
		
		if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
		   letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
			
			System.out.println("A letra \""+ letra+ "\" é uma vogal!");
			
		}else {
			System.out.println("A letra \"" + letra +"\" é Consoante");
			
		}
		

		
		
	}
}
