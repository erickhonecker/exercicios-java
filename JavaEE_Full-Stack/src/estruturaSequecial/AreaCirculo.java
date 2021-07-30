package estruturaSequecial;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		
		double r, area = 0;
		double pi = 3.1415;
		
		Scanner e = new Scanner(System.in);
		System.out.println("Digite o raio do circulo: ");
		r = e.nextDouble();
		
		area = (r * r) * pi;
		System.out.println("A área do circulo de raio " + r +" = "+ area);
		
		
	}

}
