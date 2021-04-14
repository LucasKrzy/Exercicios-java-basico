package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para escrever as seguintes sequências de números: (1, 1 2 3 4 5 6 7
 * 8 9 10) (2, 1 2 3 4 5 6 7 8 9 10) (3, 1 2 3 4 5 6 7 8 9 10) (4, 1 2 3 4 5 6 7
 * 8 9 10) e assim sucessivamente, até que o primeiro número (antes da vírgula),
 * também chegue a 10
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio86 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		String sequencia;

		// inicia a variavel
		sequencia = "";

		JOptionPane.showMessageDialog(null, "Mostrar sequência de números\npercorrendo dois laços FOR");
		// calcula os valores da tabuada e coloca na mensagem
		for (int i = 1; i < 11; i++) {
			sequencia += "(" + i + ", ";
			for (int j = 1; j < 11; j++) {
				sequencia += j + " ";
			}
			sequencia += ")\n\n";
		}

		// apresenta as tabuadas
		JOptionPane.showMessageDialog(null, sequencia);

	}

}
