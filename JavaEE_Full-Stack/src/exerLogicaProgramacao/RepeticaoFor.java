package exerLogicaProgramacao;

public class RepeticaoFor {

	public static void main(String[] args) {
		
		for( int n = 0; n <= 10; n++) {
			if(n == 3 || n == 6 || n ==9) {
				
				System.out.println("Aê, encontrei o número --> "+ n+ "\n");
				continue;

			}
			System.out.println("Só um teste");
		}
	}

}
