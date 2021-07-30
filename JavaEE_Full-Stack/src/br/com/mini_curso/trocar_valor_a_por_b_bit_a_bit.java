package br.com.mini_curso;

public class trocar_valor_a_por_b_bit_a_bit {

	public static void main(String[] args) {
	      int a = 10;
	      int b = 20;
	       a = a^b;
	       b = a^b;
	       a = b^a;
	       
	       System.out.println(a);
	       System.out.println(b);
	}

}
