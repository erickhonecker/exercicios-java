package estruturaDecisao;

import java.util.Scanner;

public class maiorMenorNumero {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);

		int num1, num2, num3, maior, menor;

		System.out.println("Digite o primeiro n° --->");
		num1 = e.nextInt();

		System.out.println("Digite o segundo n° --->");
		num2 = e.nextInt();

		System.out.println("Digite o terceiro n° --->");
		num3 = e.nextInt();

		if (num1 >= num2 & num1 >= num3 & num3 <= num2) {
			maior = num1;
			System.out.println(maior);
		}

		
		if (num1 >= num2 & num1 >= num3 & num3 >= num2) {
			maior = num1;
			System.out.println(maior);
		}

		else if (num1 <= num2 & num1 >= num3 & num3 >= num2) {
			maior = num2;
			System.out.println(maior);
		}

		else if (num1 >= num2 & num1 <= num3 & num3 >= num2) {
			maior = num3;
			System.out.println(maior);
		}

		else if (num1 <= num2 & num1 <= num3 & num3 >= num2) {
			maior = num3;
			System.out.println(maior);

		}

		else if (num1 <= num2 & num1 <= num3 & num3 <= num2) {
			maior = num2;
			System.out.println(maior);
		}
		
		else if (num2 >= num1 & num2 >= num3 & num3 <= num1) {
				maior = num2;
				System.out.println(maior);
			
		}
	}

}
