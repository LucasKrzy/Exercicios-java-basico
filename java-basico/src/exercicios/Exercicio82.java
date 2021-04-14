package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler valores e mostrar o maior e m�dia entre os valores
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio82 {
	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double maior, media, n;
		int quantidade;

		JOptionPane.showMessageDialog(null, "Programa para ler valores e mostrar o maior e a m�dia entre eles");

		// inicializa a variavel maior e media
		maior = 0;
		media = 0;

		// ler a quantidade de valores
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos valores voc� deseja informar?"));

		// ler valores e idenificar o maior
		for (int i = 1; i <= quantidade; i++) {
			n = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + i + " valor:"));
			// inicia o valor na variavel maior
			if (i == 1) {
				maior = n;
			} else if (n > maior) {
				maior = n;
			}
			// soma os valores informados
			media += n;
		}


		// verefica se a m�dia � diferente de zero e mostra a m�dia e maior valor na tela
		if (media == 0) {
			JOptionPane.showMessageDialog(null, "O maior valor informado �: " + maior + "\nA m�dia dos valores �: 0.0");
		} else {
			// calcula e mostra a m�dia e maior valor
			JOptionPane.showMessageDialog(null,
					"O maior valor informado �: " + maior + "\nA m�dia dos valores �: " + (media / quantidade));
		}

	}

}
