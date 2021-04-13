package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler a quantidade de produtos em estoque e o valor de cada produto,
 * em seguida apresentar a soma dos valores e sua média de preço
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio80 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double soma, n;
		int produtos;
		
		// inicia a soma em 0
		soma = 0;

		JOptionPane.showMessageDialog(null, "Programa para ler valores de produtos,\ncalcular o preço total entre eles\ne apresentar o valor médio\nde preço dos produtos");
		
		//ler quantidade de produtos 
		produtos = Integer.parseInt(JOptionPane.showInputDialog("Produtos em estoque:"));
		
		// ler os valores de cada produto e calcular sua soma
		for (int i = 1; i <= produtos; i++) {
			n = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto " + i + ":"));
			soma += n;
		}

		// mostra na tela o resultado do valor total e a média dos valores
		JOptionPane.showMessageDialog(null, "O valor total dos produtos é: " + soma + "\nO valor médio dos produtos é: " + (soma/produtos)) ;

	}

}
