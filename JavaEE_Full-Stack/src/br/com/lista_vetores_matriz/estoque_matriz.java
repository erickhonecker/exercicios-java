package br.com.lista_vetores_matriz;

public class estoque_matriz {

	public static void main(String[] args) {
		int estoque[][] = {{ 1200, 3700, 3737 },{ 1400, 4210, 4224 },
		           { 2000, 2240, 2444 }, { 260, 420, 330}};
		
		
			System.out.print("\t\t   produto 1"+ "   produto 2 "+"    produto 3 \n");
		
		for(int l = 0; l < estoque.length; l++ ) {
			System.out.print("Armazem " + l+"  --->");
			
			for(int c = 0; c < estoque[l].length; c++) {
				System.out.print("  |  "+estoque[l][c]+"    ");
				
				
			}
			System.out.println("    ");
		}
	
		}
		
		
	}


