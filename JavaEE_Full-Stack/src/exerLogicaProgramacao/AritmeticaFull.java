package exerLogicaProgramacao;

import java.util.Scanner;

public class AritmeticaFull {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		double number1;
		double number2;
		double sum,
			   subi,
			   multi,
			   divi;
		
		System.out.println("Digite o primeiro n�mero: ");
		number1 = e.nextDouble();
		
		System.out.println("Digite o segundo n�mero: ");
		number2 = e.nextDouble();
		
		sum = number1 + number2;
		
		subi = number1 - number2;
		
		multi = number1 * number2;
		
		divi = number1 / number2;
		
		// impress�o com formata��o -- > print
		System.out.println("A soma � " + sum + "\n");
		System.out.println("A diferen�a � " + subi + "\n");
		System.out.println("o Produto � " + multi + "\n");
		System.out.println("O quociente � " + divi);
	}

}
