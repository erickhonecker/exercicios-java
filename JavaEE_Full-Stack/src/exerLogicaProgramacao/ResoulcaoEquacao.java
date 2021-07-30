package exerLogicaProgramacao;

import java.util.Scanner;

public class ResoulcaoEquacao {
	
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		int y, a, x;
		
		// dado y = ax³ + 7 converter para LP Java.
					
			System.out.println("Digite o valor de A: ");
			a = e.nextInt();
			
			System.out.println("Digite o valor de x: ");
			x = e.nextInt();
			
			y = a * x * x * x + 7;
			
			System.out.println("Este é o resultado dessa equação ---> "+ y);
			
	}
}
