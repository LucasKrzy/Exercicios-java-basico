package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber um número e apresentar seu antecessor
 * @author Lucas Pedroso Krzyzanowski
 * @since 05/02/2021
 */
public class Exercicio15 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int n1;
		
		// recebendo valores do usuário e convertendo de string para int
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para identificar seu sucessor:"));
		
	
		// realizando operação e exibindo valor anterior
		System.out.println("O número anterior é: " + (n1 - 1));

	}

}
