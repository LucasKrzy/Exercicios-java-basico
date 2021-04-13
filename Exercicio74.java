package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores e calcular a média aritmética entre eles 
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio74 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double media, n;
		
		// inicia a média em 0
		media = 0;
	
		JOptionPane.showMessageDialog(null, "Programa para ler valores e \ncalcular a média entre eles");
		// ler 10 valores e calcular sua média
		for (int i = 0; i < 10; i++) {
			n = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor:"));
			media += n;
		}
		
		// verefica se a média é diferente de zero e mostra a média na tela
		if (media == 0) {
			JOptionPane.showMessageDialog(null, "A média dos valores é: 0.0");
		} else {
			// calcula a média e mostra na tela
			JOptionPane.showMessageDialog(null, "A média dos valores é: " + (media / 10));
		}

	}

}
