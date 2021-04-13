package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calculo de gasto em an�is para controle de frangos em uma granja
 * @author Lucas Pedroso Krzyzanowski
 * @since 05/02/2021
 */
public class Exercicio31 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int frangos;
		double total;

		// recebendo valores para as variaveis
		frangos = Integer.parseInt(JOptionPane.showInputDialog("Quantos frangos precis�o ser controlados?"));
		
		// calculando total do gasto em an�is
		total = frangos * 11;
		
		
		// exibindo o total gasto em an�is
		System.out.println("O total gasto em an�is de identifica��o e alimenta��o �: R$" + total);

	}

}
