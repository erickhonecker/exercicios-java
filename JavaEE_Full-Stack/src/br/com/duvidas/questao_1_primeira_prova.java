package br.com.duvidas;
import java.util.Scanner;

public class questao_1_primeira_prova {

	public static void main(String[] args) {
	
		int n = 0, i = 0, m = 0, a = 0;
		Scanner e = new Scanner(System.in);
		
		while (n >= 0) {
			n = e.nextInt();
			if(n > 0) {
				i = i + 1;
				a = n + a;
			}
		}
		m = a/i;
				System.out.println("M = "+ m );
	}

}
