package br.com.lista_vetores_matriz;

import java.util.Random;

public class imprimir_a_transposta_quadrada {

	public static void main(String[] args) {
		int m[][] = new int[3][3];
		int m_t[][] = new int[3][3];

		Random ale = new Random();
		System.out.println("Matriz completa:");
		for (int l = 0; l < m.length; l++) {
			for (int c = 0; c < m[l].length; c++) {
				m[l][c] = ale.nextInt(10);
				System.out.print(" " + m[l][c] + " ");
			}
			System.out.println("  ");
		}

		System.out.println("\n \n Matriz Transposta:");
		for (int l = 0; l < m.length; l++) {
			for (int c = 0; c < m[l].length; c++) {
				m_t[l][c] = m[c][l];
				System.out.print(" " + m_t[l][c] + " ");
			}
			System.out.println(" ");
		}

	}

}
