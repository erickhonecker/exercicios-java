package br.com.programacao_avancada_Swing;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela extends JFrame {

	public static final int LARGURA = 600;
	public static final int ALTURA = 600;
	private PainelPlanoCartesiano pPC;

	public Janela() {
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