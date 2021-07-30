package br.com.duvidas;


public class testando {

	public static void main(String[] args) {
		int[] v = {5,9,6,8,0,3,7};
		int x = v[2];
		int y = 0;
		
		for(int i = 0; i < v.length; i++) {
			if(v[i] <= x)
				y = y+v[i];
				
		}
		System.out.println(y);
	}

}
