package estruturaSequecial;

import java.util.Scanner;

public class LatasTinta {
	
	public static void main(String[] args) {
			Scanner e = new Scanner(System.in);
			
			double tamArea,
				litro,
			    qtdLatas,
			    precoTotal;
			
			System.out.println("Digite o tamanho da area em (m�) --> ");
			tamArea = e.nextDouble();
			
			litro = tamArea / 3; 			
			System.out.println("S�o necess�rios "+litro+" Litros para pintar "+tamArea+" m�"  );
			
			precoTotal = litro * 4.4;
			System.out.println("Pre�o Total --> "+ precoTotal);
			
			
		
	}
}
