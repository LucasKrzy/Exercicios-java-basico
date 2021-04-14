package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para converter Dolar para Real 
 * @author Lucas Pedroso Krzyzanowski
 * @since 05/02/2021
 */
public class Exercicio20 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double dolar, real;

		// recebendo valores para as variaveis
		dolar = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de Dolares para ser convertida para Real:"));
		
		// convertendo de dolar para real
		real = dolar / 6.61;
		
		// exibindo valor convertido
		System.out.println("O valor convertido de Dolar para Real é: R$ " + real);

	}

}
