package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler três valores e mostrar a multiplicação dos dois menores
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio51 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double x, y, z;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "Mostar a multiplicação dos dois menores valores");
		x = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1 valor:"));
		y = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2 valor:"));
		z = Double.parseDouble(JOptionPane.showInputDialog("Informe o 3 valor:"));
		
		// Exibir o resultado da multiplicação
		if ((x  >= y && (x >= z))) {
			JOptionPane.showMessageDialog(null, "A multiplicação dos menores valores é: " + (y * z));
		} else if ((y >= x) && (y >= z)) {
			JOptionPane.showMessageDialog(null, "A multiplicação dos menores valores é: " + (x * z));			
		}else {
			JOptionPane.showMessageDialog(null, "A multiplicação dos menores valores é: " + (x * y));			
		}
		
	}

}
