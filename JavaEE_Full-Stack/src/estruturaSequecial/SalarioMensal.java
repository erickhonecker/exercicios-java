package estruturaSequecial;

import java.util.Scanner;

public class SalarioMensal {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		
		double salarioBruto,
		       salarioLiquido, 
		       hrTrabalhada, 
		       vlHora,
		       salarioHora = 0;
		
		double ir, 
		       inss,
		       sindicato; 
		
		
		System.out.println("Digite o sal�rio bruto(R$) --> \n");
		salarioBruto = e.nextDouble();
		
		System.out.println("Digite o quanto ganha por hora trabalhada -->");
		vlHora = e.nextDouble();
		
		System.err.println("Digite a quantidade de horas trabalhadas --> ");
		hrTrabalhada = e.nextDouble();
		System.out.println("\n");
		

		
		salarioHora = vlHora * hrTrabalhada; 
		
		
		ir = (salarioBruto / 100) * 11;
		inss = (salarioBruto / 100) * 8;
		sindicato = (salarioBruto / 100) * 5;
		
		
		salarioLiquido = (((salarioBruto - ir)-inss)-sindicato);
		
		//Informa��es
		System.out.println("Informa��es do Funcion�rio ---> ");
		 
		System.out.println("Seu Salario Bruto � R$ "+salarioBruto + "\n");
		System.out.println("Desconto IR --> R$" + ir +"\n");
		System.out.println("Desconto INSS --> R$" + inss +"\n");
		System.out.println("Desconto Sindicato --> R$" + sindicato +"\n");
		System.out.println("O seu Sal�rio Liquido � R$ " + salarioLiquido +"\n");
		
		
		

	}

}
