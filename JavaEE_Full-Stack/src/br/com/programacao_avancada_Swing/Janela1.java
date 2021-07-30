package br.com.programacao_avancada_Swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Janela1 extends JFrame {
	public Janela1(String titulo) {
		super(titulo);
		// pega o container do JFrame
		Container ct = this.getContentPane();
		// modifica o layout do container para FlowLayout
		ct.setLayout(new FlowLayout());
		// cria dois bot�es para adicionar a janela
		JButton b1 = new JButton("Bot�o 1");
		JButton b2 = new JButton("Bot�o 2");// adiciona bot�es ao container		
		ct.add(b1);
		ct.add(b2);
		this.setSize(620, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Janela1("Minha primeira aplica��o Swing");
	}
}