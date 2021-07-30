package br.com.duvidas;

import java.util.Scanner;

public class divisao_por_um_numero_maior {

	public static void main(String[] args) {
		
		int dividendo, divisor, quociente;
		
		
		Scanner e = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor para dividendo");
		
		dividendo = e.nextInt();
		System.out.println("Digite o segundo valor divisor");
		divisor = e.nextInt();
		
		
		quociente = dividendo/divisor;
		
		System.out.println(quociente);
		
		
		
		
		
	}

}
