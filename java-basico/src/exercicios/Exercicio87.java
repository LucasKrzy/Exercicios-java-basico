package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para desenhar um retangulo na tela
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio87 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		String retangulo;
		
		//inicia variavel retnagulo vazia
		retangulo = "";

		JOptionPane.showMessageDialog(null, "Programa para desenhar um retangulo na tela");
		// contagem de linhas
		for (int i = 0; i < 10; i++) {
			//  atribuição da primeira e ultima linha
			if ((i == 0) || (i == 9)) {
				// percorre as colunas colocando o caractere "+"
				for (int c = 0; c < 60; c++) {
					retangulo += "+";
				}
			// atribuindo nas linhas restantes
			} else {
				// precore coluna por coluna
				for (int c = 0; c < 60; c++) {
					// colocando "+" na primeira e ultima coluna
					if ((c == 0) || (c == 59)) {
						retangulo += "+";
					} else {
					// colocando " " nas colunas restantes
						retangulo += " ";
					}
				}
			}
			// pula linha
			retangulo += "\n";
		}
		
		// Mostra no console 
		System.out.println(retangulo);
	}

}
