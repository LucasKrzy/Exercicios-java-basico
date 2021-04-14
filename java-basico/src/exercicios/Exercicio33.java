package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para cálculo do total economizado por Pedrinho em seu cofrinho
 * @author Lucas Pedroso Krzyzanowski
 * @since 05/02/2021
 */
public class Exercicio33 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int m1, m5, m10, m25, m50, real1;
		double total;

		// recebendo valores para as variaveis
		m1 = Integer.parseInt(JOptionPane.showInputDialog("Quantas moedas de 1 centavo foram economizadas?"));
		m5 = Integer.parseInt(JOptionPane.showInputDialog("Quantas moedas de 5 centavos foram economizadas?"));
		m10 = Integer.parseInt(JOptionPane.showInputDialog("Quantas moedas de 10 centavos foram economizadas?"));
		m25 = Integer.parseInt(JOptionPane.showInputDialog("Quantas moedas de 25 centavos foram economizadas?"));
		m50 = Integer.parseInt(JOptionPane.showInputDialog("Quantas moedas de 50 centavos foram economizadas?"));
		real1 = Integer.parseInt(JOptionPane.showInputDialog("Quantas moedas de 1 real foram economizadas?"));

		// calculando total economizado
		total = m1 * 0.01 + m5 * 0.05 + m10 * 0.10 + m25 * 0.25 + m50 * 0.50 + real1;
		
		
		// exibindo o total economizado por Pedrinho
		System.out.println("O total economizado por Pedrinho foi: R$" + String.format("%.2f", total));

	}

}
