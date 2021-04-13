package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler dois valores e mostrar o maior ou se s�o iguais
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio56 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double x, y;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "MVerificar qual o maior n�mero ou se os ambos s�o iguais");
		x = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1 valor:"));
		y = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2 valor:"));
		
		// Exibir o maior
		if (x  > y ) {
			JOptionPane.showMessageDialog(null, "Primeiro � maior");
		} else if (y > x) {
			JOptionPane.showMessageDialog(null, "Sgundo maior");			
		}else {
			JOptionPane.showMessageDialog(null, "N�meros iguais");			
		}
		
	}

}
