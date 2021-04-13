package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 números e contar quantos números informados são negativos
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio72 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		int negativo, n;

		// inicializa a variavel negativo em 0
		negativo = 0;
		
		JOptionPane.showMessageDialog(null, "Programa para ler valores e mostar \nquantos negativos foram informados");
		// ler 10 valores e contar quantos valores negativos
		for (int i = 0; i < 10; i++) {
			n = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
			if (n<0) {
				negativo++;
			}
		}
		
		// apresenta quantos valores negativos fora informados
		JOptionPane.showMessageDialog(null, "Foram informados: " + negativo + " números negativos.");
	}

}
