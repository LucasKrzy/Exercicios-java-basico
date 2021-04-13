package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler três valores e mostrar a soma dos dois maiores
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio50 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double x, y, z;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "Mostar a soma dos dois maiores valores");
		x = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1 valor:"));
		y = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2 valor:"));
		z = Double.parseDouble(JOptionPane.showInputDialog("Informe o 3 valor:"));
		
		// Exibir o resultado da soma
		if ((x  <= y && (x <= z))) {
			JOptionPane.showMessageDialog(null, "A soma dos maiores valores é: " + (y + z));
		} else if ((y <= x) && (y <= z)) {
			JOptionPane.showMessageDialog(null, "A soma dos maiores valores é: " + (x + z));			
		}else {
			JOptionPane.showMessageDialog(null, "A soma dos maiores valores é: " + (x + y));			
		}
		
	}

}
