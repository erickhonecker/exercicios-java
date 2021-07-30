package br.com.programacao_avancada_Swing;

import java.awt.*;
import javax.swing.*;

public class Exemplo_professor extends JFrame {

	public static final int LARGURA = 600;
	public static final int ALTURA = 600;
	private PainelPlanoCartesiano pPC;

	public Exemplo_professor() {
			super.setTitle("Janela");
			PainelPlanoCartesiano pPC = new PainelPlanoCartesiano(Janela.LARGURA, Janela.ALTURA);
			getContentPane().add(pPC);

			setBounds(300, 30, Janela.LARGURA + 17, Janela.ALTURA + 40);
			setResizable(false);
			super.setVisible(true);
			super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}

	public static void main(String[] args) {
		new Janela();
	}
}

class PainelPlanoCartesiano extends JPanel {

	private int largura;
	private int altura;

	public PainelPlanoCartesiano(int l, int a) {
		largura = l;
		altura = a;
		setSize(l, a);
	}

	public void desenhaQuadriculado(Graphics g) {

		// desenha as linhas verticais

		g.setColor(new Color(204, 204, 204));

		for (int i = 0; i < altura; i = i + 10) {

			g.drawLine(i, 0, i, largura);

		}

		// desenha as linhas horizontais
		g.setColor(new Color(204, 204, 204));
		for (int i = 0; i < largura; i = i + 10) {

			g.drawLine(0, i, altura, i);

		}

	}

	public void escreveValoresEixo_X(Graphics g) {

		g.setColor(Color.BLACK);

		// escreve valores e marcas no eixo X positivo

		for (int i = 30; i < 300; i = i + 30) {

			g.drawLine((largura / 2) + i, altura / 2 - 4, (largura / 2) + i, altura / 2 + 4);

			g.drawString("" + i, (largura / 2) + i - 5, altura / 2 + 20);

		}

		// escreve valores e marcas no eixo X negativo

		for (int i = -270; i < 0; i = i + 30) {

			g.drawLine((largura / 2) + i, altura / 2 - 4, (largura / 2) + i, altura / 2 + 4);

			g.drawString("" + i, (largura / 2) + i - 10, altura / 2 + 20);

		}

	}

	public void desenhaEixos(Graphics g) {
		g.setColor(Color.BLACK);

		// desenha o eixo y (ordenada)
		g.drawLine(largura / 2, 0, largura / 2, altura);

		// desenha o eixo x (abscissa)
		g.drawLine(0, altura / 2, largura, altura / 2);

	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		desenhaQuadriculado(g);

		desenhaEixos(g);

	}
}
