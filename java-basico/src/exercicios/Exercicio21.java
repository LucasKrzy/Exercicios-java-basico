package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber custo de fábrica de um carro e calcular o custo para o consumidor final 
 * @author Lucas Pedroso Krzyzanowski
 * @since 05/02/2021
 */
public class Exercicio21 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double custoFabrica, custoFinal;

		// recebendo valores para as variaveis
		custoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Informe o custo de fábrica do carro:"));
		
		// convertendo de dolar para real
		custoFinal = custoFabrica + custoFabrica * 0.28 + custoFabrica * 0.48 ;
		
		// exibindo custo do carro para o consumidor final
		System.out.println("O custo final do carro é: R$ " + custoFinal);

	}

}
