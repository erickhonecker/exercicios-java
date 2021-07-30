package br.com.programacao;

public class Exer3 {

	public static void main(String[] args) {

		int x = 650;
		int unidade, dezena, centena;

		unidade = x % 10 / 10;
		dezena = x % 100 / 10;
		centena = x % 1000 / 100;
		System.out.println(centena);
		System.out.println(dezena);
		System.out.println(unidade);

	}

}