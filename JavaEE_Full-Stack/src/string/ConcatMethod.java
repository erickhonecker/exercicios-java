package string;

import java.util.Scanner;

public class ConcatMethod {

	public static void main(String[] args) {
		 Scanner e = new Scanner(System.in);
		 
		 String nome1, nome2;
		  
		 System.out.println("Digite aqui seu nome: ");
		 nome1 = e.nextLine();
		 
		 System.out.println("Digite aqui seu sobrenome: ");
		 nome2 = e.nextLine();
		 
		 // o metodo com concat() concatena os caracteres(variaveis) passado como parametros;
		 System.out.println(nome1.concat(nome2));
		 
	}

}
