package br.com.duvidas;

public class TestandoFor {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i > 5 && i < 8) {
				continue;
			}
			System.out.println(i);
		}
	}

}
