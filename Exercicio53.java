package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler três valores e mostrar em ordem decrescente
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio53 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double x, y, z;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "Mostar os valores em ordem decrescente");
		x = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1 valor:"));
		y = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2 valor:"));
		z = Double.parseDouble(JOptionPane.showInputDialog("Informe o 3 valor:"));
		
		// Exibir os valores em ordem decrescente
		if ((x  >= y && (x >= z))) {
			if (y >= z) {
				JOptionPane.showMessageDialog(null, x + ", " + y + ", " + z);
			}else {
				JOptionPane.showMessageDialog(null, x + ", " + z + ", " + y);
			}
		} else if ((y >= x) && (y >= z)) {
			if (x >= z) {
				JOptionPane.showMessageDialog(null, y + ", " + x + ", " + z);
			}else {
				JOptionPane.showMessageDialog(null, y + ", " + z + ", " + x);
			}
		}else {
			if (x >= y) {
				JOptionPane.showMessageDialog(null, z + ", " + x + ", " + y);
			}else {
				JOptionPane.showMessageDialog(null, z + ", " + y + ", " + x);
			}
		}
		
	}

}
