package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores e calcular a m�dia aritm�tica entre eles 
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio74 {
	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double media, n;
		
		// inicia a m�dia em 0
		media = 0;
	
		JOptionPane.showMessageDialog(null, "Programa para ler valores e \ncalcular a m�dia entre eles");
		// ler 10 valores e calcular sua m�dia
		for (int i = 0; i < 10; i++) {
			n = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor:"));
			media += n;
		}
		
		// verefica se a m�dia � diferente de zero e mostra a m�dia na tela
		if (media == 0) {
			JOptionPane.showMessageDialog(null, "A m�dia dos valores �: 0.0");
		} else {
			// calcula a m�dia e mostra na tela
			JOptionPane.showMessageDialog(null, "A m�dia dos valores �: " + (media / 10));
		}

	}

}
