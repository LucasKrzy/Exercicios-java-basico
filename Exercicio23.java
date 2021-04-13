package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para converter Fahrenheit para Celsius
 * @author Lucas Pedroso Krzyzanowski
 * @since 05/02/2021
 */
public class Exercicio23 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double c, f;

		// recebendo valores para as variaveis
		f = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em Fahrenheit para ser convertida para Celsius:"));
		
		// convertendo de dolar para real
		c = (f-32) * 5 / 9;
		
		// exibindo valor convertido
		System.out.println("A temperatura convertida para Celsius é: " + c);

	}

}
