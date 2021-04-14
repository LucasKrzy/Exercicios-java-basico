package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para converter Celsius para Fahrenheit
 * @author Lucas Pedroso Krzyzanowski
 * @since 05/02/2021
 */
public class Exercicio30 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double c, f;

		// recebendo valores para as variaveis
		c = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em Celsius para ser convertida para Fahrenheit:"));
		
		// convertendo de dolar para real
		f = c * 9 / 5 + 32;
		
		// exibindo valor convertido
		System.out.println("A temperatura convertida para Fahrenheit é: " + f);

	}

}
