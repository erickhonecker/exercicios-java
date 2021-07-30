package string;

import java.util.Scanner;

public class TrimMethod {

	public static void main(String[] args) {
		 
		Scanner e = new Scanner(System.in);
		
		String texto;
		
		System.out.println("Digite aqui o texto que voce quer remover alguns espaços!");
		texto = e.nextLine();

		// trim é um método da classe String, trim() remove os espaços no inicio e no final do texto!
		System.out.println("Aqui está o texto com alguns espaços removidos! \n"+ texto.trim());
		
	}

}
