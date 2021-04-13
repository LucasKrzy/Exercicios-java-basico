package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o ano atual e ano de nascimento de uma pessoa, em seguida mostrar se a pessoa poder� ou n�o votar este ano
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio40 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		int anoNasc, anoAtual;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "Verifica��o se uma pessoa poder� votar esse ano");
		anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento:"));
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual:"));
		
		// Exibir se a pessoa poder� ou n�o votar
		if (anoAtual - anoNasc >= 	16) {
			JOptionPane.showMessageDialog(null, "A pessoa poder� votar esse ano");
		} else {
			JOptionPane.showMessageDialog(null, "A pessoa n�o poder� votar esse ano");			
		}
		
	}

}
