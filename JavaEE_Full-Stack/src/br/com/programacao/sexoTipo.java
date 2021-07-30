package br.com.programacao;

import java.util.Scanner;

public class sexoTipo {

	public static void main(String[] args) {

		String sexo;

		Scanner e = new Scanner(System.in);

		System.out.println("Por favor informe apenas a inicial do seu sexo: ");
		sexo = e.next();

		if (sexo.equals("m")) {

			System.out.println("Sexo Masculino!");

		} else if (sexo.equals("f")) {

			System.out.println("Sexo Feminino!");

		} else {
			System.out.println("Sexo inexistente!!!");
		}

	}

}
