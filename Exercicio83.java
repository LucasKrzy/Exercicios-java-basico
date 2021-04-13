package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o c�digo e pre�o de 5 valores, em seguida mostrar o mais caro e a m�dia dos pre�os
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio83 {
	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double maior, media, n;
		int codigoMaior, cod;

		JOptionPane.showMessageDialog(null, "Programa para ler 5 produtos e seus pre�os\ne em seguida aprezentar:\n-O produto mais caro\n-A m�dia dos pre�os");

		// inicializa a variavel maior e media
		maior = 0;
		media = 0;
		codigoMaior = 0;


		// ler valores e idenificar o maior
		for (int i = 1; i <= 5; i++) {
			cod = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + i + " codigo:"));
			n = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o do produto " + cod + ":"));
			// inicia o valor na variavel maior
			if (i == 1) {
				maior = n;
				codigoMaior = cod;
			} else if (n > maior) {
				maior = n;
				codigoMaior = cod;
			}
			// soma os valores informados
			media += n;
		}


		// verefica se a m�dia � diferente de zero e mostra a m�dia e maior valor dos produtos na tela
		if (media == 0) {
			JOptionPane.showMessageDialog(null, "O produto mais caro �: " + codigoMaior + " - custando R$ " + maior + "\nA m�dia dos pre�os �: R$ 0.00" );
		} else {
			JOptionPane.showMessageDialog(null, "O produto mais caro �: " + codigoMaior + " - custando R$ " + maior + "\nA m�dia dos pre�os �: " + (media / 5));
		}

	}

}
