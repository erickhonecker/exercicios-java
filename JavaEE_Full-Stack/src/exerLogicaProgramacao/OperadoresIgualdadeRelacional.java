package exerLogicaProgramacao;

import java.util.Scanner;

public class OperadoresIgualdadeRelacional {

	public static void main(String[] args) {
		
		
		Scanner e = new Scanner(System.in);
		
		int number1;
		int number2;
		
		System.out.println("Digite o primeiro numero: ");
		number1 = e.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		number2 = e.nextInt();
		
		if(number1 == number2) 
			System.out.printf("%d == %d\n", number1, number2 );
		
		if(number1 != number2) 
			System.out.printf("%d != %d\n", number1, number2 );
		
		if(number1 < number2) 
			System.out.printf("%d < %d\n", number1, number2 );
		
		if(number1 > number2) 
			System.out.printf("%d > %d\n", number1, number2 );
		
		if(number1 <= number2) 
			System.out.printf("%d <= %d\n", number1, number2 );
		
		if(number1 >= number2) 
			System.out.printf("%d >= %d\n", number1, number2 );
	}

}
