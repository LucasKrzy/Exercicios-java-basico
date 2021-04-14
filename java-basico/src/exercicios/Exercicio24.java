package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular a média ponderada de um aluno
 * @author Lucas Pedroso Krzyzanowski
 * @since 05/02/2021
 */
public class Exercicio24 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double n1, n2, n3, media ;

		// recebendo valores para as variaveis
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1:"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2:"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 3:"));
		
		// calculando média do aluno
		media = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
		
		// exibindo a média do aluno
		System.out.println("A média do aluno é: " + media);

	}

}
