package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular a quantidade em quilos dos ingredientes necessarios para produção de lanches
 * @author Lucas Pedroso Krzyzanowski
 * @since 05/02/2021
 */
public class Exercicio29 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int lanches;
		double queijo, presunto, hamburguer;

		// recebendo valores para as variaveis
		lanches = Integer.parseInt(JOptionPane.showInputDialog("Quantos lanches serão preparados?"));
		
		// calculando total dos ingredientes
		queijo = lanches * 0.100;
		presunto = lanches * 0.050;
		hamburguer = lanches * 0.100;
		
		
		// exibindo o total de cada ingrediente
		System.out.println("Ingredientes para preparar os lanches: \n");
		System.out.println("O total de queijo é: " + queijo + "kg");
		System.out.println("O total de presunto é: " + presunto + "kg");
		System.out.println("O total de hamburguer é: " + hamburguer + "kg");

	}

}
