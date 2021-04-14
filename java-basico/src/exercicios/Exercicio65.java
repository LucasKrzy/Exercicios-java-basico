package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber as notas de um aluno, aceitando apenas valores entre 0 e 10
 * e em seguida calcular sua média
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio65 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double n1, n2;
		
		// Captura de dados utilizando o DO WHILE para aceitar apenas valores entre 0 e 10
		// captura nota 1
		do {
			n1 = Double.parseDouble(JOptionPane.showInputDialog("Os valores das notas devem ser entre 0 e 10\n"
					+ "Informe a nota 1: "));
		} while ((n1 < 0) || (n1 > 10));
		
		// captura nota 2
		do {
			n2 = Double.parseDouble(JOptionPane.showInputDialog("Os valores das notas devem ser entre 0 e 10\n"
					+ "Informe a nota 2: "));
		} while ((n2 < 0) || (n2 > 10));
		
		// calcula e mostra a média do aluno
		JOptionPane.showMessageDialog(null, "A média do aluno é: " + ((n1+n2)/2));
	}

}
