package br.com.programacao;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class calcularSalario {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);

		double num;
		double salario;

		salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o Sal�rio?"));
		num = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o percentual de aumento? "));
		salario = ((salario * num) / 100) + salario;

		JOptionPane.showMessageDialog(null, " Seu novo sal�rio �: R$" + salario);

	}

}
