package exerLogicaProgramacao;

import java.util.Scanner;

public class MediaSwitchCase {

	public static void main (String[] args) {
        
		Scanner e = new Scanner(System.in);
		
		String s;
        
		System.out.println("Digite aqui:");
		s = e.next();
        
        switch (s) {
        case "desprez�vel":
            System.out.println ("despicable"); break;
        case "aur�ola":
            System.out.println ("halo"); break;
        case "fungo":
            System.out.println ("fungus"); break;
        case "fuj�o":
            System.out.println ("fugitive"); break;
        case "abstruso":
            System.out.println ("abstruse"); break;
        default: System.out.println("Tu � doido!"); 
        }
    }

}
