package exerLogicaProgramacao;

import java.util.Scanner;

public class MediaSwitchCase {

	public static void main (String[] args) {
        
		Scanner e = new Scanner(System.in);
		
		String s;
        
		System.out.println("Digite aqui:");
		s = e.next();
        
        switch (s) {
        case "desprezível":
            System.out.println ("despicable"); break;
        case "auréola":
            System.out.println ("halo"); break;
        case "fungo":
            System.out.println ("fungus"); break;
        case "fujão":
            System.out.println ("fugitive"); break;
        case "abstruso":
            System.out.println ("abstruse"); break;
        default: System.out.println("Tu é doido!"); 
        }
    }

}
