package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um numero e imprimir sua tabuado
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio71 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		int n;

		// recebe o valor que você deseja a tabuada
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog("Informe o número que você deseja a tabuada"
					+ "\n(Apenas de 1 a 10)"));
		} while ((n < 1) || (n > 10));

		// exibindo a tabuada do numero informado
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + (i * n));
		}
	}

}
