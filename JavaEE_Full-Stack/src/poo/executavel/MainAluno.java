package poo.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import poo.classes.Aluno;
import poo.classes.Disciplina;

public class MainAluno {

	public static void main(String[] args) {

		Aluno aluno;
		aluno = new Aluno();
		
		List<Aluno> listAluno = new ArrayList<Aluno>();

		String qtd = JOptionPane.showInputDialog("Quantos alunos você quer cadastrar?: ");
		
		for (int j = 0; j <= Integer.valueOf(qtd)-1; j++) {

			String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
			aluno.setNome(nome);
			
			/*
			 * String idade = JOptionPane.showInputDialog("Digite a idade do aluno: ");
			 * aluno.setIdade(Integer.valueOf(idade));
			 * 
			 * String dtNascimento =
			 * JOptionPane.showInputDialog("Digite a Data de Nascimento: ");
			 * aluno.setDataNascimento(dtNascimento);
			 * 
			 * String rg = JOptionPane.showInputDialog("Digite o RG do aluno: ");
			 * aluno.setRg(rg);
			 * 
			 * String cpf = JOptionPane.showInputDialog("Digite o CPF do aluno: ");
			 * aluno.setCpf(cpf);
			 * 
			 * String nomeMae = JOptionPane.showInputDialog("Digite o nome da mãe: ");
			 * aluno.setNomeMae(nomeMae);
			 * 
			 * String nomePai = JOptionPane.showInputDialog("Digite o nome do Pai: ");
			 * aluno.setNomePai(nomePai);
			 * 
			 * String dtMatricula =
			 * JOptionPane.showInputDialog("Digite a data da Matrícula: ");
			 * aluno.setDataMatricula(dtMatricula);
			 * 
			 * String nomeEscola = JOptionPane.showInputDialog("Digite o nome da escola: ");
			 * aluno.setNomeEscola(nomeEscola);
			 * 
			 * String serieMatricula =
			 * JOptionPane.showInputDialog("Digite o série matrículada: ");
			 * aluno.setSerieMatricula(serieMatricula);
			 */

		
			String qtdDisciplina = JOptionPane.showInputDialog("Quantas disciplina deseja cadastrar?");

			for (int i = 1; i <= Double.valueOf(qtdDisciplina); i++) {

				String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da Disciplina " + i + " -->");
				String notaDisciplina = JOptionPane.showInputDialog("Digite a nota da Disciplina:" + i + " -->");

				Disciplina disciplina = new Disciplina();
				
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));
				aluno.getDisciplinas().add(disciplina);
				// System.out.println(aluno.getDisciplinas().get(i -1));

			}

			int escolha = JOptionPane.showConfirmDialog(null, "Você quer remover alguma disciplina?");
			
			
			if (escolha == 0) {
			
				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {
					int n = 1;
					for (Disciplina disciplina1 : aluno.getDisciplinas()) {
						System.out.println("Disciplina -> "+n+":"+disciplina1.getDisciplina());
						System.out.println("------------------------------");
						n++;
					}
					String removerDisciplina = JOptionPane
							.showInputDialog("Qual disciplina voce quer remover 1, 2, 3 ou 4?");
					aluno.getDisciplinas().remove(Integer.valueOf(removerDisciplina).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Vai continuar removendo?");
				}
			}

			/*
			 * Disciplina disc1 = new Disciplina(); disc1.setDisciplina("Banco de Dados");
			 * disc1.setNota(10);
			 * 
			 * Disciplina disc2 = new Disciplina(); disc2.setDisciplina("Java");
			 * disc2.setNota(9);
			 * 
			 * 
			 * Disciplina disc3 = new Disciplina();
			 * disc3.setDisciplina("Engenharia de Software"); disc3.setNota(8);
			 * 
			 * aluno.getDisciplinas().add(disc1); aluno.getDisciplinas().add(disc2);
			 * aluno.getDisciplinas().add(disc3);
			

			System.out.println("Nome do Aluno -->" + aluno.getNome());
			System.out.println("Idade do Aluno -->" + aluno.getIdade());
			System.out.println("Data de Nascimento do Aluno -->" + aluno.getDataNascimento());
			System.out.println("RG do Aluno -->" + aluno.getRg());
			System.out.println("CPF do Aluno -->" + aluno.getCpf());
			System.out.println("Nome da Mãe -->" + aluno.getNomeMae());
			System.out.println("Nome do Pai -->" + aluno.getNomePai());
			System.out.println("Data da Matrícula -->" + aluno.getDataMatricula());
			System.out.println("Nome da Escola -->" + aluno.getNomeEscola());
			System.out.println("Identificação Matrícula -->" + aluno.getSerieMatricula());
			System.out.println("A Media do aluno é --> " + aluno.getMediaNota());
 */
			if (aluno.getAlunoAprovado() == true) {
				System.out.println("Aprovado");
			} else if (aluno.getAlunoAprovado() == false && (aluno.getMediaNota() < 7 && aluno.getMediaNota() > 5)) {
				System.out.println("Aluno em Recuperação");
			} else {
				System.out.println("Aluno Reprovado");
			}

			System.out.println("\n");
			listAluno.add(aluno);

		}
		
		String nomePesquisar = JOptionPane.showInputDialog("Digite o nome do aluno, que você quer informação:");
		for (Aluno aluno2 : listAluno) {
			if(aluno2.getNome().equalsIgnoreCase(nomePesquisar)) {
				System.out.println("Nome do Aluno: "+aluno2.getNome());
				System.out.println("Aluno aprovado? "+aluno2.getAlunoAprovado());
				System.out.println("Média do Aluno: "+aluno2.getMediaNota());
				break;
				
			}
		}
			String nomeRemover = JOptionPane.showInputDialog("Digite o nome do aluno, que você quer informação:");
			for (Aluno aluno2 : listAluno) {
				if(aluno2.getNome().equalsIgnoreCase(nomeRemover)) {
					listAluno.remove(aluno2);
					break;
					
				}
	
		}
			
			for (Disciplina disciplina1 : aluno.getDisciplinas()) {
				System.out.println(disciplina1.getDisciplina());
				
			}

		// Metódo toString
//		System.out.println("<-------------- Metódo toString  ------------->");
//		System.out.println(aluno.toString());

		/*
		 * aluno.setNome("Erick honecker"); aluno.setIdade(24);
		 * aluno.setDataNascimento("13/11/1995"); aluno.setRg("9091955");
		 * aluno.setCpf("10526433369"); aluno.setNomeMae("Lidia Domingos");
		 * aluno.setNomePai("Neto oliveira"); aluno.setDataMatricula("13/09/2000");
		 * aluno.setNomeEscola("Edson Régis"); aluno.setSerieMatricula("15sdfd56");
		 * aluno.setNota1(10); aluno.setNota2(8); aluno.setNota3(10);
		 * 
		 * 
		 * Aluno al = new Aluno("Erick", 24, "13/11/1995", "9091944", "10836455567",
		 * "Lidia Domingos","José neto","15/12/2000", "Maria do ceu", "1542df24");
		 * 
		 * 
		 * 
		 * System.out.println("Nome do Aluno -->"+al.nome);
		 * System.out.println("Idade do Aluno -->"+al.idade);
		 * System.out.println("Data de Nascimento do Aluno -->"+al.dataNascimento);
		 * System.out.println("RG do Aluno -->"+al.rg);
		 * System.out.println("CPF do Aluno -->"+al.cpf);
		 * System.out.println("Nome da Mãe -->"+al.nomeMae);
		 * System.out.println("Nome do Pai -->"+al.nomePai);
		 * System.out.println("Data da Matrícula -->"+al.dataMatricula);
		 * System.out.println("Nome da Escola -->"+al.nomeEscola);
		 * System.out.println("Identificação Matrícula -->"+al.serieMatricula);
		 * 
		 * 
		 */
	}
	}

