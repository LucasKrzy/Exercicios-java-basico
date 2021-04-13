package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler dois valores e mostrar em ordem cescente
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio42 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double x, y;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "Mostar os valores informados em ordem crescente");
		x = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1 valor:"));
		y = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2 valor:"));
		
		// Exibir os valores em ordem crescente
		if (x  > y) {
			JOptionPane.showMessageDialog(null, y + ", " + x);
		} else {
			JOptionPane.showMessageDialog(null, x + ", " + y);			
		}
		
	}

}
