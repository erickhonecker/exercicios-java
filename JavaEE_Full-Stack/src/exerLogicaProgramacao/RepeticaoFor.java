package exerLogicaProgramacao;

public class RepeticaoFor {

	public static void main(String[] args) {
		
		for( int n = 0; n <= 10; n++) {
			if(n == 3 || n == 6 || n ==9) {
				
				System.out.println("A�, encontrei o n�mero --> "+ n+ "\n");
				continue;

			}
			System.out.println("S� um teste");
		}
	}

}
