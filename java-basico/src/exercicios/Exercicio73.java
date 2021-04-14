package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 números e contar quantos números informados estão entre 10 e 20
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio73 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		int cont, n;

		// inicializa a variavel contadora em 0
		cont = 0;
		
		JOptionPane.showMessageDialog(null, "Programa para ler valores e \nmostar quantos desses números\nentre 10 e 20 foram informados");
		// ler 10 valores e contar quantos valores entre 10 e 20
		for (int i = 0; i < 10; i++) {
			n = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor:"));
			if ((n >= 10) && (n <= 20)) {
				cont++;
			}
		}
		
		// apresenta quantos valores entre 10 e 20 fora informados
		JOptionPane.showMessageDialog(null, "Foram informados: " + cont + " números entre 10 e 20.");
	}

}
