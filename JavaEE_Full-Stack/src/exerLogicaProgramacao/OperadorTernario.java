package exerLogicaProgramacao;

public class OperadorTernario {

	public static void main(String[] args) {

		int nota1 = 10;
		int nota2 = 10;
		int media = 0;
		
		

		// Estrutura condicional com IF e ELSE
		media = (nota1 + nota2) / 2;
		if (media >= 7) {
			System.out.println("Parabens, você foi aprovado com média ---> " + media);
		} else if (media < 7 & media >= 4) {
			System.out.println("Sua média foi --> " + media + ", Você ficou em recuperação!");

		} else {
			System.out.println("Infelizmente você foi reprovado com média ---> " + media);
		}

		// Operador ternário

		String saidaResult = media >= 7 ? "Sua média foi " + media + " você foi aprovado!"
				: (media < 7 & media >= 4) ? "Aluno em recuperação com média " + media
						: "Sua média foi " + media + " você foi reprovado!";
		System.out.println(saidaResult);
	}

}
