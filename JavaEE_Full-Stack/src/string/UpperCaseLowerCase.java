package string;

import java.util.Scanner;

public class UpperCaseLowerCase {

	public static void main(String[] args) {
			
		Scanner e = new Scanner(System.in);
		
		String t ;
		
		System.out.println("Digite seu texto: ");
		
		t = e.nextLine();
		
		System.out.println(t.toLowerCase());
		System.out.println(t.toUpperCase());
		
		
		
	}

}

