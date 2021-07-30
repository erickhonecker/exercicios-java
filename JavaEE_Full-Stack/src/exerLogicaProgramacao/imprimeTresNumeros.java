package exerLogicaProgramacao;

import java.util.Scanner;

public class imprimeTresNumeros {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Digite o Primeiro número: ");
		a = e.nextInt();
		
		System.out.println("Digite o segundo número: ");
		b = e.nextInt();
		
		System.out.println("Digite o Terceiro número: ");
		c = e.nextInt();
		
		System.out.println("Este é o valor de A --> "+a);
		System.out.println("Este é o valor de B --> "+b);
		System.out.println("Este é o valor de C --> "+c+"\n");
		
		if(a >= 0 ) {
			System.out.println("A raiz quadrada é --> "+Math.sqrt(a));
		}else {
			System.out.println(("O quadrado de A é -->"+ a * a));
		}
		if( b > 10  &&  b < 100) {
			System.out.println("O número está entre 10 e 100 - Intervalo permitido!");
		}
		
		if(c < b ) {
			System.out.println(" A diferença entre C e B é ---> "+ (c - b));
		}else {
			System.out.println("A soma de C + 1 é ----> "+(c+1));
		}
	}

}
