package br.com.programacao;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IdadePorDia {

	public static void main(String[] args) {

		int dia;
		int mes;
		int ano;
		int continua;
		int idadeDias;

		Scanner e = new Scanner(System.in);

		System.out.println(
				"Digite sua idade por extenso. ex: 3 anos, 2 meses e 30 dias: \n siga os passos a seguir. digite 1 pra continuar ");
		continua = e.nextInt();

		if (continua == 1) {
			JOptionPane.showConfirmDialog(null, "Alô Mundo! ");
			System.out.println("digite a idade(ano):");
			ano = e.nextInt();

			System.out.println("Digite o Mês(idade):");
			mes = e.nextInt();

			System.out.println("Digite o dia(idade):");
			dia = e.nextInt();

			dia *= 1;
			mes *= 30;
			ano *= 365;
			idadeDias = dia + mes + ano;

			System.out.println(idadeDias);

		}

	}

}
