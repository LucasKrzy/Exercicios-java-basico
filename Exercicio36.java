package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um número e mostrar se o mesmo é maior do que 10
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio36 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double x;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "Progama para verificação se número informado é maior do que 10");
		x = Double.parseDouble(JOptionPane.showInputDialog("Informe um número:"));

		// Exibir se o numero informado é maior do que dez ou não
		if (x > 10) {
			JOptionPane.showMessageDialog(null, "É MAIOR QUE 10");
		} else {
			JOptionPane.showMessageDialog(null, "NÃO É MAIOR QUE 10");			
		}
		
	}

}
