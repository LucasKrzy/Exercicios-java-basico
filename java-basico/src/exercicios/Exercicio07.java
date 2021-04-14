package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber e apresentar variáveis idade, altura e peso, e apresentação no
 * console
 * @author Lucas Pedroso Krzyzanowski
 * @since 05/02/2021
 */
public class Exercicio07 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int idade;

		double altura;

		double peso;

		// recebendo valores para as variaveis
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura:"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso:"));
		
		//

		// exibindo valores das variáveis no console
		System.out.println("Idade: " + idade + " anos");
		System.out.println("Altura: " + altura + "m");
		System.out.println("Peso: " + peso + "kg");

	}

}
