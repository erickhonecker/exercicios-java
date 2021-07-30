package br.com.programacao;
import java.util.Scanner;
public class calculadora_teste {

	public static void main(String[] args) {
		int opcao, num1, num2, resul;

		String menu = "Programa Calculadora \n\n" +
		"1 - Somar\n"+
		"2 - Subrtrair\n" +
		"3 - Multiplicar\n" +
		"4 - Dividir\n" +
		"5 - Potência\n" +
		"6 - Raiz Quadrada\n" +
		"7 - Finalizar\n\n";
		System.out.println(menu);
		Scanner e = new Scanner(System.in);
		opcao = e.nextInt();
		
		switch( opcao){
		
		case 1:
			// Soma
			System.out.println("Digite o primeiro número:");
			num1 = e.nextInt();
			System.out.println("Digite o segundo número:");
			num2 = e.nextInt();
			resul = num1 + num2;
			System.out.println("Resultado é: " + resul);
			
			break;

		case 2:
			// Subtração
			System.out.println("Digite o primeiro número:");
			num1 = e.nextInt();
			System.out.println("Digite o segundo número:");
			num2 = e.nextInt();
			resul = num1 - num2;
			System.out.println("Resultado é: " + resul);

			break;

		case 3:
			// Multiplicação
			System.out.println("Digite o primeiro número:");
			num1 = e.nextInt();
			System.out.println("Digite o segundo número:");
			num2 = e.nextInt();
			resul = num1 * num2;
			System.out.println("Resultado é: " + resul);
			
			break;

		case 4:
			// Divisão
			System.out.println("Digite o primeiro número:");
			num1 = e.nextInt();
			System.out.println("Digite o segundo número:");
			num2 = e.nextInt();
			resul = num1 / num2;
			System.out.println("Resultado é: " + resul);

			break;

		case 5:
			// Potência
			System.out.println("Digite o primeiro número:");
			num1 = e.nextInt();
			System.out.println("Digite o segundo número:");
			num2 = e.nextInt();
			resul= (int) Math.pow(num1, num2);
			System.out.println(resul);
			
			break;

		case 6:
			 // Raiz Quadrada
			 System.out.println("Digite o primeiro número:");
			 num1 = e.nextInt();
			 resul = (int) Math.sqrt(num1);
			 System.out.println(resul);
			break;

		case 7:
			
			break;
		}
		
	}

}
