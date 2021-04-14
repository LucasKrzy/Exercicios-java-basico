package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um n�mero e mostrar se o mesmo � maior do que 10
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio36 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double x;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "Progama para verifica��o se n�mero informado � maior do que 10");
		x = Double.parseDouble(JOptionPane.showInputDialog("Informe um n�mero:"));

		// Exibir se o numero informado � maior do que dez ou n�o
		if (x > 10) {
			JOptionPane.showMessageDialog(null, "� MAIOR QUE 10");
		} else {
			JOptionPane.showMessageDialog(null, "N�O � MAIOR QUE 10");			
		}
		
	}

}
