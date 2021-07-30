package br.com.lista_vetores_matriz;

import java.util.Random;

public class matriz_transposta_ordem_2x3_para_3x2 {

	public static void main(String[] args) {
		
		int m[][] = {{1,2,3},{4,5,6}};
		int m_t[][] = new int[3][2];

		// Random ale = new Random();
		
		
		System.out.println("Matriz completa:");
		for (int l = 0; l < m.length; l++) {
			for (int c = 0; c < m[l].length; c++) {
				System.out.print(" " + m[l][c] + " ");
			}
			System.out.println("  ");
		}

		System.out.println("\n \n Matriz Transposta:");
		for (int li = 0; li < m_t.length; li++) {
			for (int co = 0; co < m_t[li].length; co++) {
			      m_t[li][co] = m[co][li];
		
				System.out.print(" "+m_t[li][co]+" ");
			}
			System.out.println(" ");

		}


	}
}