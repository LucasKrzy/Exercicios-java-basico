package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores e mostrar o maior e menor valor
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio81 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double maior, menor, n;
	
		JOptionPane.showMessageDialog(null, "Programa para ler 10 valores e mostrar o maior e menor");
		
		//inicializa as variaveis maior e menor
		maior = 0;
		menor = 0;
		// ler valores e idenificar o maior e menor
		for (int i = 1; i <= 10; i++) {
			n = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + i + " valor:"));
			// inicia o valor nas variaveis menor e maior
			if (i == 1) {
				menor = n;
				maior = n;
			} else if (n < menor) {
				menor = n;
			} else if (n > maior) {
				maior = n;
			}
		}
		
		JOptionPane.showMessageDialog(null,"O maior valor informado é: "+ maior + "\nO menor valor informado é: " + menor);


	}

}
