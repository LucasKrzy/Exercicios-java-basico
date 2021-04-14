package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calculo de total de litros de refrigerante comprados por um revendedor
 * @author Lucas Pedroso Krzyzanowski
 * @since 05/02/2021
 */
public class Exercicio32 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int lata, garrafa600, garrafa2l;
		double total;

		// recebendo valores para as variaveis
		lata = Integer.parseInt(JOptionPane.showInputDialog("Quantas latas de 350ml foram compradas?"));
		garrafa600 = Integer.parseInt(JOptionPane.showInputDialog("Quantas latas de 600ml foram compradas?"));
		garrafa2l = Integer.parseInt(JOptionPane.showInputDialog("Quantas garrafas de 2 litros foram compradas?"));
		
		// calculando total em litros
		total = lata * 0.35 + garrafa600 * 0.6 + garrafa2l * 2;
		
		
		// exibindo o total de litros de refrigerante comprados
		System.out.println("O total de litros de refirerante comprados é: " + total);

	}

}
