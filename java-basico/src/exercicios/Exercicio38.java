package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um número de maças e calcular o preço da compra
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio38 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		int macas;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "Cálculo do valor de compra de maças");
		macas = Integer.parseInt(JOptionPane.showInputDialog("Informe um número de maças compradas:"));

		// Exibir o total da compra
		if (macas >= 12) {
			JOptionPane.showMessageDialog(null, "O valor total da compra das maças é: R$ " + macas + ".00");
		} else {
			JOptionPane.showMessageDialog(null, "O valor total da compra das maças é: R$ " + String.format("%.2f", macas * 1.3));			
		}
		
	}

}
