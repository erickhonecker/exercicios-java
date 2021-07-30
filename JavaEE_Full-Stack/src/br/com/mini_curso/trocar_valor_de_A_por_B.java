package br.com.mini_curso;

public class trocar_valor_de_A_por_B {

	public static void main(String[] args) {
    int a = 2, b = 3, n;
    
    n = a;
    a = b;
    b = n;
    
    System.out.println(b);
    System.out.println(a); 
    
	}

}
