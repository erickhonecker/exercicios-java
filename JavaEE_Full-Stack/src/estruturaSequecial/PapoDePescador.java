package estruturaSequecial;

import java.util.Scanner;

public class PapoDePescador {
	
	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
				
		double peso,
			   excesso,
			   multa;
		
		
		System.out.println("Digite o peso do peixa em KG: ");
		peso = e.nextDouble();
		
		
		if(peso > 50) {
			
			excesso = (peso - 50);
			multa = (excesso * 4);
			System.out.println("Você passou " +excesso+ " Kg"+" além do limite(50Kg), o valor da multa é R$"+ multa);
		}else {
			
			System.out.println("Está tudo Ok!");
		}
					
		
	}

}
