package br.com.programacao;

import java.util.Scanner;

import javax.swing.*;

public class Celsiu_para_Fahrenheit {

	public static void main(String[] args) {

		double c, f;

		JFrame frame = new JFrame();
		c = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor da temperatura em Celsius:"));

		f = c * 9 / 5 + 32;
		JOptionPane.showMessageDialog(frame, "Esse é o valor da conversão para Fahrenheit: \n\n " + f + "", // mensagem
				"Conversão", // titulo da janela
				JOptionPane.YES_NO_CANCEL_OPTION);

		/*
		 * 
		 * Scanner e = new Scanner(System.in);
		 * 
		 * 
		 * System.out.println("Digite o valor da temperatura"); c =
		 * e.nextDouble();
		 * 
		 * f = c * 9/5 + 32;
		 * 
		 * System.out.println(c +"°C em Fahrenheit "+ f);
		 * 
		 * 
		 * 
		 */

	}

}
