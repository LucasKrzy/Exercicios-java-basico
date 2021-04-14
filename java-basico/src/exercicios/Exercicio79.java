package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular e escrever a média aritmética dos números inteiros entre 15 e 100 
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio79 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double media, cont;

		// inicializando variavel media e cont em 0
		media = 0;
		cont = 0;
		
		JOptionPane.showMessageDialog(null, "Programa para calcular a média dos valores inteiros\n contidos entre 15 e 100");
		
		// realiza a soma de todos os numeros etnre 15 e 100
		for (int i = 15; i <= 100; i++) {
			media += i;
			cont++;
		}
		
		// mostra na tela o resultado da media
		JOptionPane.showMessageDialog(null, "A media da soma dos valores de 15 a 100 é: " + (media/cont));

	}

}
