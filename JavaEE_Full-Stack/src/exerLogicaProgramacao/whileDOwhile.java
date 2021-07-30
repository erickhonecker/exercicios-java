package exerLogicaProgramacao;

public class whileDOwhile {

	public static void main(String[] args) {
		
		int numero = 0;
		
		while (numero < 5) {
			
			System.out.println("WHILE : O numero atual é --> "+ numero);
			numero ++;
		}
		
		
		
		int numero1 = 0;
		do {
		
			System.out.println("DO WHILE: O numero atual é --> " + numero1);
			numero1++;
		}while(numero1 < 5);
	}

}
