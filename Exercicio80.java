package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler a quantidade de produtos em estoque e o valor de cada produto,
 * em seguida apresentar a soma dos valores e sua m�dia de pre�o
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio80 {
	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double soma, n;
		int produtos;
		
		// inicia a soma em 0
		soma = 0;

		JOptionPane.showMessageDialog(null, "Programa para ler valores de produtos,\ncalcular o pre�o total entre eles\ne apresentar o valor m�dio\nde pre�o dos produtos");
		
		//ler quantidade de produtos 
		produtos = Integer.parseInt(JOptionPane.showInputDialog("Produtos em estoque:"));
		
		// ler os valores de cada produto e calcular sua soma
		for (int i = 1; i <= produtos; i++) {
			n = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto " + i + ":"));
			soma += n;
		}

		// mostra na tela o resultado do valor total e a m�dia dos valores
		JOptionPane.showMessageDialog(null, "O valor total dos produtos �: " + soma + "\nO valor m�dio dos produtos �: " + (soma/produtos)) ;

	}

}
