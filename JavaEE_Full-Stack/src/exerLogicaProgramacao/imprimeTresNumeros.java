package exerLogicaProgramacao;

import java.util.Scanner;

public class imprimeTresNumeros {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Digite o Primeiro n�mero: ");
		a = e.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		b = e.nextInt();
		
		System.out.println("Digite o Terceiro n�mero: ");
		c = e.nextInt();
		
		System.out.println("Este � o valor de A --> "+a);
		System.out.println("Este � o valor de B --> "+b);
		System.out.println("Este � o valor de C --> "+c+"\n");
		
		if(a >= 0 ) {
			System.out.println("A raiz quadrada � --> "+Math.sqrt(a));
		}else {
			System.out.println(("O quadrado de A � -->"+ a * a));
		}
		if( b > 10  &&  b < 100) {
			System.out.println("O n�mero est� entre 10 e 100 - Intervalo permitido!");
		}
		
		if(c < b ) {
			System.out.println(" A diferen�a entre C e B � ---> "+ (c - b));
		}else {
			System.out.println("A soma de C + 1 � ----> "+(c+1));
		}
	}

}
