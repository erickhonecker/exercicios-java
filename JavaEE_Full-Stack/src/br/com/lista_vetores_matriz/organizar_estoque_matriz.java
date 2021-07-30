package br.com.lista_vetores_matriz;

public class organizar_estoque_matriz {

	public static void main(String[] args) {
		int estoque[][] = { { 1200, 3700, 3737 }, { 1400, 4210, 4224 }, { 2000, 2240, 2444 }, { 260, 420, 330 } };
		int soma = 0;

		// Organização do Estoque
		// A) Ler o estoque inicial
		System.out.println("Itens em Estoque:");
		System.out.print("\t      | Produto 1|");
		System.out.print("Produto 2 |");
		System.out.print(" Produto 3 |\n");
		System.out.print("Armazém 1 -->");
		System.out.print(" |   " + estoque[0][0] + "\t");
		System.out.print(" |   " + estoque[0][1] + "  ");
		System.out.print(" |   " + estoque[0][2] + "    |\n");
		System.out.print("Armazém 2 -->");
		System.out.print(" |   " + estoque[1][0] + " \t");
		System.out.print(" |   " + estoque[1][1] + "  ");
		System.out.print(" |   " + estoque[1][2] + "    |\n");
		System.out.print("Armazém 3 -->");
		System.out.print(" |   " + estoque[2][0] + "\t");
		System.out.print(" |   " + estoque[2][1] + "  ");
		System.out.print(" |   " + estoque[2][2] + "    |\n");
		System.out.print("Curso ------>");
		System.out.print(" |   " + estoque[3][0] + "\t");
		System.out.print(" |   " + estoque[3][1] + "  ");
		System.out.print("  |   " + estoque[3][2] + "     |  \n ");

		/* ------------------------------------------------------------------ */

		// B) Soma de cada Armazém
		System.out.println("\nTotal: \n");
		for (int l = 0; l < estoque.length - 1; l++) {
			for (int c = 0; c < estoque[l].length; c++) {
				soma = soma + estoque[l][c];
			}

			System.out.println("Armazém " + (l + 1) + ": " + soma + " ");
			System.out.println("  ");
			soma = 0;
		}

		// C) Armazém com maior qtd produto 2
		for (int l = 0; l < estoque.length - 1; l++) {
			for (int c = 1; c < estoque[1].length; c++ ) {
				if(estoque[l][1] > soma) {
					soma = estoque[l][1];
					
					
				}
			}
			
		}System.out.println("O Maior Armazem :"+soma);
	
	}
}
