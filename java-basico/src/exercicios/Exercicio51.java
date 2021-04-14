package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler tr�s valores e mostrar a multiplica��o dos dois menores
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio51 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double x, y, z;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "Mostar a multiplica��o dos dois menores valores");
		x = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1 valor:"));
		y = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2 valor:"));
		z = Double.parseDouble(JOptionPane.showInputDialog("Informe o 3 valor:"));
		
		// Exibir o resultado da multiplica��o
		if ((x  >= y && (x >= z))) {
			JOptionPane.showMessageDialog(null, "A multiplica��o dos menores valores �: " + (y * z));
		} else if ((y >= x) && (y >= z)) {
			JOptionPane.showMessageDialog(null, "A multiplica��o dos menores valores �: " + (x * z));			
		}else {
			JOptionPane.showMessageDialog(null, "A multiplica��o dos menores valores �: " + (x * y));			
		}
		
	}

}
