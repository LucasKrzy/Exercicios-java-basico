package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores e calcular a soma entre os valores menores o que 40
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio77 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double soma, n;

		// inicia a soma em 0
		soma = 0;

		JOptionPane.showMessageDialog(null, "Programa para ler valores e calcular a soma \nentre os valores menores do que 40");
		// ler 10 valores e calcular sua soma dos menores do que 40
		for (int i = 0; i < 10; i++) {
			n = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor:"));
			if (n < 40) {
				soma += n;
			}
		}

		// mostra na tela o resultado da soma entre os valores menores do que 40
		JOptionPane.showMessageDialog(null, "A soma dos valores indicados menores do que 40 é: " + soma);

	}

}
