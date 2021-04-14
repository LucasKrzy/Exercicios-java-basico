package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber e mostrar salário e vale refeição
 * @author Lucas Pedroso Krzyzanowski
 * @since 05/02/2021
 */
public class Exercicio08 {


	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double salario, vr;
		
		// recebendo valores para as variaveis
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário:"));
		vr = Double.parseDouble(JOptionPane.showInputDialog("Informe seu vale-refeição:"));
		
		// Exibe na tela salário e vale refeição
		System.out.println("Salário: R$ " + salario);
		System.out.println("Vale refeição: R$ " + vr);
		

	}

}
