package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um n�mero de ma�as e calcular o pre�o da compra
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio38 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		int macas;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "C�lculo do valor de compra de ma�as");
		macas = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero de ma�as compradas:"));

		// Exibir o total da compra
		if (macas >= 12) {
			JOptionPane.showMessageDialog(null, "O valor total da compra das ma�as �: R$ " + macas + ".00");
		} else {
			JOptionPane.showMessageDialog(null, "O valor total da compra das ma�as �: R$ " + String.format("%.2f", macas * 1.3));			
		}
		
	}

}
