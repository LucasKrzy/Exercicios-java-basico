package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um n�mero e mostrar se o mesmo � positivo ou negativo
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio37 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double x;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "Progama para verifica��o se n�mero informado � positivo ou negativo");
		x = Double.parseDouble(JOptionPane.showInputDialog("Informe um n�mero:"));

		// Exibir se o numero informado � positivo ou negativo
		if (x >= 0) {
			JOptionPane.showMessageDialog(null, "O n�mero informado � positivo");
		} else {
			JOptionPane.showMessageDialog(null, "O n�mero informado � negativo");			
		}
		
	}

}
