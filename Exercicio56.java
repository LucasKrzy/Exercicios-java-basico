package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler dois valores e mostrar o maior ou se são iguais
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio56 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double x, y;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "MVerificar qual o maior número ou se os ambos são iguais");
		x = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1 valor:"));
		y = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2 valor:"));
		
		// Exibir o maior
		if (x  > y ) {
			JOptionPane.showMessageDialog(null, "Primeiro é maior");
		} else if (y > x) {
			JOptionPane.showMessageDialog(null, "Sgundo maior");			
		}else {
			JOptionPane.showMessageDialog(null, "Números iguais");			
		}
		
	}

}
