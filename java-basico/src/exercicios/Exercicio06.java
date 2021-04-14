package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber nome, celular e cidade, e apresentação no console
 * @author Lucas Pedroso Krzyzanowski
 *@since 05/02/2021
 */
public class Exercicio06 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		String nome;
		String celular;
		String cidade;
		
		// recebendo valores para as variaveis
		nome = JOptionPane.showInputDialog("Informe seu nome:");
		celular = JOptionPane.showInputDialog("Informe seu celular:");
		cidade = JOptionPane.showInputDialog("Informe sua cidade:");
		
		// exibindo valores das variáveis no console
		System.out.println("Nome: " + nome);
		System.out.println("Celular: " + celular);
		System.out.println("Cidade: " + cidade);

	}

}
