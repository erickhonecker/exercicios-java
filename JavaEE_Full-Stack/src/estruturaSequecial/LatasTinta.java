package estruturaSequecial;

import java.util.Scanner;

public class LatasTinta {
	
	public static void main(String[] args) {
			Scanner e = new Scanner(System.in);
			
			double tamArea,
				litro,
			    qtdLatas,
			    precoTotal;
			
			System.out.println("Digite o tamanho da area em (m²) --> ");
			tamArea = e.nextDouble();
			
			litro = tamArea / 3; 			
			System.out.println("São necessários "+litro+" Litros para pintar "+tamArea+" m²"  );
			
			precoTotal = litro * 4.4;
			System.out.println("Preço Total --> "+ precoTotal);
			
			
		
	}
}
