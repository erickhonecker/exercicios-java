package exerLogicaProgramacao;

public class OperadorTernario {

	public static void main(String[] args) {

		int nota1 = 10;
		int nota2 = 10;
		int media = 0;
		
		

		// Estrutura condicional com IF e ELSE
		media = (nota1 + nota2) / 2;
		if (media >= 7) {
			System.out.println("Parabens, voc� foi aprovado com m�dia ---> " + media);
		} else if (media < 7 & media >= 4) {
			System.out.println("Sua m�dia foi --> " + media + ", Voc� ficou em recupera��o!");

		} else {
			System.out.println("Infelizmente voc� foi reprovado com m�dia ---> " + media);
		}

		// Operador tern�rio

		String saidaResult = media >= 7 ? "Sua m�dia foi " + media + " voc� foi aprovado!"
				: (media < 7 & media >= 4) ? "Aluno em recupera��o com m�dia " + media
						: "Sua m�dia foi " + media + " voc� foi reprovado!";
		System.out.println(saidaResult);
	}

}
