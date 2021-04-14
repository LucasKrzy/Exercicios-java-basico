package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber a quantidade de eleitores em uma cidade, a quantia de
 * votos brancos, nulos e validos e calcular a porcentagem de cada tipo de voto
 * @author Lucas Pedroso Krzyzanowski
 * @since 05/02/2021
 */
public class Exercicio18 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int total, branco, nulo, valido;
		double br, nu, va;

		// recebendo valores para as variaveis
		total = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de votos:"));
		branco = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de votos em branco:"));
		nulo = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de votos nulos:"));
		valido = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade e votos válidos:"));

		// calculando percentual de votos
		br = branco * 100 / total;
		nu = nulo * 100 / total;
		va = valido * 100 / total;
		
		// exibindo percentual de votos
		System.out.println("Percentual de votos brancos: " + br + "%.");
		System.out.println("Percentual de votos nulos: " + nu + "%.");
		System.out.println("Percentual de votos validos: " + va + "%.");

	}

}
