package br.com.duvidas;

public class valor_de_S {
	public static void main(String[] args) {
		int res, y = 1, acu = 0;
		
		
		for( int x = 1; x < 50; x++ ) { 
		     y+=2;
		     res = y/x;
		     acu +=res;
		     
		     

			System.out.println(acu);
			
		}
		
		
	}

}
