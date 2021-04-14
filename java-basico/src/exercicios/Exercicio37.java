package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um número e mostrar se o mesmo é positivo ou negativo
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio37 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double x;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "Progama para verificação se número informado é positivo ou negativo");
		x = Double.parseDouble(JOptionPane.showInputDialog("Informe um número:"));

		// Exibir se o numero informado é positivo ou negativo
		if (x >= 0) {
			JOptionPane.showMessageDialog(null, "O número informado é positivo");
		} else {
			JOptionPane.showMessageDialog(null, "O número informado é negativo");			
		}
		
	}

}
