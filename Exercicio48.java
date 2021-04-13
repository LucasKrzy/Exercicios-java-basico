package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler tr�s valores e mostrar o maior
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio48 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double x, y, z;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "Mostar o maior valor");
		x = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1 valor:"));
		y = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2 valor:"));
		z = Double.parseDouble(JOptionPane.showInputDialog("Informe o 3 valor:"));
		
		// identificar e mostrar o maior valor
		if ((x  >= y && (x >= z))) {
			JOptionPane.showMessageDialog(null, "O maior valor informado �: " + x);
		} else if ((y >= x) && (y >= z)) {
			JOptionPane.showMessageDialog(null, "O maior valor informado �: " + y);			
		}else {
			JOptionPane.showMessageDialog(null, "O maior valor informado �: " + z);			
		}
		
	}

}
