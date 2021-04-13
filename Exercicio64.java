package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dois valores e exibir o resultado da divis�o entre eles
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio64 {
	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double dividendo, divisor;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "Receber n�meros e realizar uma divis�o");
		dividendo = Double.parseDouble(JOptionPane.showInputDialog("Informe o dividendo"));
		
		// recebendo o divisor - tem que ser diferente de 0
		divisor = 0; // inicializa o divisor em 0
		
		while (divisor == 0) {
			divisor = Double.parseDouble(JOptionPane.showInputDialog("Informe o divisor"));
		}
		
		// mostra na tela o resultado da divis�o
		JOptionPane.showMessageDialog(null, dividendo + " / " + divisor + " = " + dividendo / divisor);
	}

}
