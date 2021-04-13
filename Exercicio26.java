package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber data e m�s e calcular quantos dias se passam do inicio do ano at� a data informada
 * @author Lucas Pedroso Krzyzanowski
 * @since 05/02/2021
 */
public class Exercicio26 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int dia, mes, totalDias;
		
		// recebendo valores para as variaveis
		dia = Integer.parseInt(JOptionPane.showInputDialog("Informe um dia:"));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Informe um m�s :"));
		
		// calculando idade em dias
		totalDias = mes * 30 + dia;

		// exibindo valores das vari�veis no console

		System.out.println("O total de dias do inicio do ano at� a data informada �: " + totalDias + " dias.");

	}

}
