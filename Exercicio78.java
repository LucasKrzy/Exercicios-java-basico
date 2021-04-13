package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler dois valores e apresentar a soma dos valores inteiros entre os valores informados
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio78 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		int x, y, soma;

		// inicializando variavel de soma em 0
		soma = 0;
		
		JOptionPane.showMessageDialog(null, "Programa para ler dois valores e realizar soma de todos os números inteiros entre eles");
		
		// ler valores
		x = Integer.parseInt(JOptionPane.showInputDialog("Informe o 1 valor:"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Informe o 2 valor:"));
		
		while (x <= y) {
			soma += x;
			x++;					
		}

		// mostra na tela o resultado da soma
		JOptionPane.showMessageDialog(null, "A soma entre os valores é: " + soma);

	}

}
