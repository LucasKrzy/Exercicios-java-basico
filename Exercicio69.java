package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um numero e imprimir todos os inteiros entre 1 e o numero informado
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio69 {
	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		int n;
		
		// recebe um valor que voc� deseja contar
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero que voc� deseja parar de contar"));
		} while (n < 0);
		
		// exibindo os valores entre 1 e N 
		for (int i = 1; i <= n; i++) {
			System.out.println("Numero: " + i);
		}
	}

}
