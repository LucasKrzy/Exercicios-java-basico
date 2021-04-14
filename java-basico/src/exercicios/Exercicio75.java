package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores e calcular a média aritmética entre eles 
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio75 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		int alunos;
		double media, n;
		
		// inicia a média em 0
		media = 0;
		
		JOptionPane.showMessageDialog(null, "Programa para ler valores e \ncalcular a média entre eles");
		
		// solicita a quantidade de alunos
		alunos = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos tem na sala?"));
	
		// ler 10 valores e calcular sua média
		for (int i = 1; i <= alunos; i++) {

			do {
				n = Double.parseDouble(JOptionPane.showInputDialog("Os valores das notas devem ser entre 0 e 10\n"
						+ "Informe a nota do aluno " + i + ": "));
			} while ((n < 0) || (n > 10));
			
			media += n;
		}
		
		// verefica se a média é diferente de zero e mostra a média na tela
		if (media == 0) {
			JOptionPane.showMessageDialog(null, "A média dos alunos é: 0.0");
		} else {
			// calcula a média e mostra na tela
			JOptionPane.showMessageDialog(null, "A média dos alunos é: " + (media / alunos));
		}

	}

}
