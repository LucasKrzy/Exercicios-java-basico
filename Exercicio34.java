package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calculo da receita de um refresco
 * @author Lucas Pedroso Krzyzanowski
 * @since 05/02/2021
 */
public class Exercicio34 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double refresco, suco, agua;

		// recebendo valores para as variaveis
		refresco = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros de refresco ser�o preparados? "));
		
		// calculando total em litros
		suco = refresco * 0.2;
		agua = refresco * 0.8;
		
		
		// exibindo a receita do refresco
		System.out.println("Receita refresco de maracuj� \n");
		System.out.println("Litros de �gua: " + agua);
		System.out.println("Litros de suco: " + suco);

	}

}
