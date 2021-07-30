package br.com.matrizes;


public class solucaoPraTudo {
	public static boolean RespostaParatudo(int x, int y, int z) {
		int s = x*x*x + y*y*y + z*z*z;
		if(s == 42) 
			return true;
		return false;
	}
	public static void main(String[] args) {
for( int x = 1; x <= 10; x++ ) {
	for(int y = 1; y <= 10; y++) {
		for(int z = 1; z <= 10; z++) {
			
			System.out.println("X = " +x+ " Y = " +y+ " Z = "+z+ "Resultado: "+ RespostaParatudo(x,y,z));
			System.out.println();
		}
	}
}
	}



}
