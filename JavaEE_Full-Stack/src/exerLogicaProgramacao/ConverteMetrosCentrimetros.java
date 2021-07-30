package exerLogicaProgramacao;

import java.util.Scanner;

public class ConverteMetrosCentrimetros {

	public static void main(String[] args) {

		int cm = 0;
		int metro = 0;
		int valorConvertirdo = 0;
		int opcao = 0;
		
		Scanner e = new Scanner(System.in);
		
		System.out.println("Converter de Metros par Centimetros digite 1, caso contrario digite 2 ");
		opcao = e.nextInt();
		
		if(opcao == 1 ) {
			System.out.println("Digite o valor(m) a ser convertido para centimetros: ");
			metro = e.nextInt();
			valorConvertirdo = metro * 100;
			System.out.println(metro + " metros convertido para Centimetros é --> "+valorConvertirdo +" cm ");
		}else if(opcao == 2) {
			System.out.println("Digite o valor(cm) a ser convertido para metros: ");
			cm = e.nextInt();
			valorConvertirdo = cm / 100;
			System.out.println(cm + " cm convertido para metros é --> "+valorConvertirdo+ "m");
		}else {
			System.out.println("Opção inválida!");
		}
		
		
		
	}

}
