package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber o ano de nascimento e ano atual em seguida calcular a idade em anos, meses, semanas e dias
 * @author Lucas Pedroso Krzyzanowski
 * @since 05/02/2021
 */
public class Exercicio35 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int dia, mes, semana, ano, anoAtual, anoNascimento;
		
		// recebendo valores para as variaveis
		anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do seu nascimento:"));
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual :"));
		
		// calculando idade em dias, semanas, meses e anos
		ano = anoAtual - anoNascimento;
		mes = ano * 12;
		semana = ano * 52;
		dia = ano * 365;		
		
		// exibindo sua idade em anos, meses, semanas e dias
		System.out.println("Idade total: \n");
		System.out.println("Sua idade em anos é: " + ano + " anos.");
		System.out.println("Sua idade em mêses é: " + mes + " mêses.");
		System.out.println("Sua idade em semanas é: " + semana + " semanas.");
		System.out.println("Sua idade em dias é: " + dia + " dias.");

	}

}
