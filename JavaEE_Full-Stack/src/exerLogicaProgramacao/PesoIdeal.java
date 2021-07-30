package exerLogicaProgramacao;

import java.util.Scanner;

public class PesoIdeal {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		double altura, pesoIdeal;
		String sexo;
		
		
		
		System.out.println("Vamos calcular seu peso ideal!\n");
		
		System.out.println("Digite seu sexo, F para feminino e M para masculino: ");
		sexo = e.nextLine();
		
		System.out.println("Digite sua altura em Centimetros: ");
		altura = e.nextDouble();
		
		
		if (sexo.equalsIgnoreCase("m")){
			
			pesoIdeal = (72.7 * altura) - 58;
				System.out.println("Seu peso ideial é --> "+ pesoIdeal);
			
		}else if(sexo.equalsIgnoreCase("f")) {
			
			pesoIdeal = (62.1 * altura) - 44.7;
				System.out.println("Seu peso ideial é --> "+ pesoIdeal);
			
		}else {
			
			System.out.println("Opção invalida!");
		}
			
		
		
		
	}

}
