package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calculo de gasto em anéis para controle de frangos em uma granja
 * @author Lucas Pedroso Krzyzanowski
 * @since 05/02/2021
 */
public class Exercicio31 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int frangos;
		double total;

		// recebendo valores para as variaveis
		frangos = Integer.parseInt(JOptionPane.showInputDialog("Quantos frangos precisão ser controlados?"));
		
		// calculando total do gasto em anéis
		total = frangos * 11;
		
		
		// exibindo o total gasto em anéis
		System.out.println("O total gasto em anéis de identificação e alimentação é: R$" + total);

	}

}
