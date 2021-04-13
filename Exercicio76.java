package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores e calcular a soma entre eles
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio76 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double soma, n;

		// inicia a soma em 0
		soma = 0;

		JOptionPane.showMessageDialog(null, "Programa para ler valores e \ncalcular a soma entre eles");
		// ler 10 valores e calcular sua soma
		for (int i = 0; i < 10; i++) {
			n = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor:"));
			soma += n;
		}

		// mostra na tela o resultado da soma
		JOptionPane.showMessageDialog(null, "A soma dos valores é: " + soma);

	}

}
