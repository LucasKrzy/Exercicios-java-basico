package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber um n�mero e apresentar seu antecessor
 * @author Lucas Pedroso Krzyzanowski
 * @since 05/02/2021
 */
public class Exercicio15 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int n1;
		
		// recebendo valores do usu�rio e convertendo de string para int
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para identificar seu sucessor:"));
		
	
		// realizando opera��o e exibindo valor anterior
		System.out.println("O n�mero anterior �: " + (n1 - 1));

	}

}
