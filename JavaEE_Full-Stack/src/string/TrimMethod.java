package string;

import java.util.Scanner;

public class TrimMethod {

	public static void main(String[] args) {
		 
		Scanner e = new Scanner(System.in);
		
		String texto;
		
		System.out.println("Digite aqui o texto que voce quer remover alguns espa�os!");
		texto = e.nextLine();

		// trim � um m�todo da classe String, trim() remove os espa�os no inicio e no final do texto!
		System.out.println("Aqui est� o texto com alguns espa�os removidos! \n"+ texto.trim());
		
	}

}
