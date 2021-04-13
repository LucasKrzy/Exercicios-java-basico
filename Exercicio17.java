package exercicios;

import javax.swing.JOptionPane;
/**
 * Programa para receber data de nascimento e apresentar a idade em dias
 * @author Lucas Pedroso Krzyzanowski
 * @since 05/02/2021
 */
public class Exercicio17 {
	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int idadeDias, anoNasc, mesNasc, diaNasc;

		// recebendo valores para as variaveis
		anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Informe seu ano de nascimento:"));
		mesNasc = Integer.parseInt(JOptionPane.showInputDialog("Informe seu mês de nascimento:"));
		diaNasc = Integer.parseInt(JOptionPane.showInputDialog("Informe seu dia de nascimento:"));
		
		// calculando idade em dias
		idadeDias = (2021 - anoNasc) * 365 + mesNasc * 30 + diaNasc;

		// exibindo valores das variáveis no console
		System.out.println("Idade total em dias é: " + idadeDias + " dias.");

	}

}
