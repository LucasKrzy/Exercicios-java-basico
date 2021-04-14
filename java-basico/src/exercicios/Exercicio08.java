package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber e mostrar sal�rio e vale refei��o
 * @author Lucas Pedroso Krzyzanowski
 * @since 05/02/2021
 */
public class Exercicio08 {


	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double salario, vr;
		
		// recebendo valores para as variaveis
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu sal�rio:"));
		vr = Double.parseDouble(JOptionPane.showInputDialog("Informe seu vale-refei��o:"));
		
		// Exibe na tela sal�rio e vale refei��o
		System.out.println("Sal�rio: R$ " + salario);
		System.out.println("Vale refei��o: R$ " + vr);
		

	}

}
