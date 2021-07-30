package br.com.duvidas;

public class BooleanRecebeBoolean {

	public static void main(String[] args) {

		boolean a = false;
		boolean b = true;
		boolean igualAB = (a = b);
		System.out.println(igualAB);
	}

}
