package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber data de nascimento e apresentar a idade em dias
 * @author Lucas Pedroso Krzyzanowski
 * @since 05/02/2021
 */
public class Exercicio27 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int p, m, g;
		double total;
		// recebendo valores para as variaveis
		p = Integer.parseInt(JOptionPane.showInputDialog("Quantas camisetas P foram vendidas?"));
		m = Integer.parseInt(JOptionPane.showInputDialog("Quantas camisetas M foram vendidas?"));
		g = Integer.parseInt(JOptionPane.showInputDialog("Quantas camisetas G foram vendidas?"));
		
		// calculando total das vendas
		total = p * 10 + m * 12 + g * 15;
		
		// exibindo valores das variáveis no console
		System.out.println("O total arrecadado nas vendas é: R$ " + total);

	}

}
