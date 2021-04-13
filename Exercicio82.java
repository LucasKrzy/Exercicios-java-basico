package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler valores e mostrar o maior e média entre os valores
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio82 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double maior, media, n;
		int quantidade;

		JOptionPane.showMessageDialog(null, "Programa para ler valores e mostrar o maior e a média entre eles");

		// inicializa a variavel maior e media
		maior = 0;
		media = 0;

		// ler a quantidade de valores
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos valores você deseja informar?"));

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


		// verefica se a média é diferente de zero e mostra a média e maior valor na tela
		if (media == 0) {
			JOptionPane.showMessageDialog(null, "O maior valor informado é: " + maior + "\nA média dos valores é: 0.0");
		} else {
			// calcula e mostra a média e maior valor
			JOptionPane.showMessageDialog(null,
					"O maior valor informado é: " + maior + "\nA média dos valores é: " + (media / quantidade));
		}

	}

}
