package exerLogicaProgramacao;

import java.util.Scanner;

public class ProdutoTresInteiros {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int x, y, z, result;
		
		System.out.println("Digite o valor do primeiro número: ");
		x = e.nextInt();
		
		System.out.println("Digite o valor do segundo número: ");
		y = e.nextInt();
		
		System.out.println("Digite o valor do segundo número: ");
		z = e.nextInt();
		
		
		result = x * y * z;
		
		System.out.printf("Product is %d\n", result);
	}

}
