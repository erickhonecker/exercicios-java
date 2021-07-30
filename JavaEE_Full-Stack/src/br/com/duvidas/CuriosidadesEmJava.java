package br.com.duvidas;

public class CuriosidadesEmJava {

	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		int c;

		// 1 --->7
		c = b-- + ++a;
		System.out.println(c);

		// 2 --->6
		a = 2;
		b = 4;
		c = ++a + b--;
		System.out.println(c);

		// 3 ---> 6
		a = 1;
		c = b-- + ++b;
		System.out.println(c);

		// 4 ---> 12

		b = 6;
		c = --b + b++;

		System.out.println(c);
	

	}

}
