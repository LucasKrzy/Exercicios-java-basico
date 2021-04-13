package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o ano atual e ano de nascimento de uma pessoa, em seguida mostrar se a pessoa poderá ou não votar este ano
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio40 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		int anoNasc, anoAtual;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "Verificação se uma pessoa poderá votar esse ano");
		anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento:"));
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual:"));
		
		// Exibir se a pessoa poderá ou não votar
		if (anoAtual - anoNasc >= 	16) {
			JOptionPane.showMessageDialog(null, "A pessoa poderá votar esse ano");
		} else {
			JOptionPane.showMessageDialog(null, "A pessoa não poderá votar esse ano");			
		}
		
	}

}
