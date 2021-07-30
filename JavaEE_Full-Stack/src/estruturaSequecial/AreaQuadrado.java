package estruturaSequecial;

import java.util.Scanner;

public class AreaQuadrado {

		public static void main(String[] args) {
			
			Scanner e = new Scanner(System.in);
			
			double area,areaDobro,b,h = 0;
			
			System.out.println("Digite a area do quadrado! ");
			b = e.nextDouble();
			h = b;
			area = b * h;
			areaDobro = (area * 2);
			
			System.out.println("A área do quadrado é -->" + area );
			System.out.println("O dobro da área do quadrado é -->" + areaDobro );
			
			
			
			
		}
}
