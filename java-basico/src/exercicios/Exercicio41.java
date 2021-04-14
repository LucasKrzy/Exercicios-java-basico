package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler dois valores e mostrar o maior
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio41 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double x, y;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "Mostar o maior valor");
		x = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1 valor:"));
		y = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2 valor:"));
		
		// Exibir o m
		if (x  > y) {
			JOptionPane.showMessageDialog(null, "O maior valor informado é: " + x);
		} else {
			JOptionPane.showMessageDialog(null, "O maior valor informado é: " + y);			
		}
		
	}

}
