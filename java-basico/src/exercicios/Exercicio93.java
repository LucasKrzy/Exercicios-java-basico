package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler a 20 numeros e os apresentar em ordem inversa e o
 * apresentando
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio93 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando o vetor
		double vetor[];
		String mensagem = "Valores no vetor em ordem inversa: ";

		// Iniciando o vetor e informando a quantidade de posições (tamanho)
		vetor = new double[20];

		JOptionPane.showMessageDialog(null,"Ler valores e os apresentar em ordem inversa");
		// Valorizando o vetor com dados informados pelo usuario
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o "+ (i+1)+" valor"));
		}

		// exibindo os dados gravados no vetor
		for (int i = (vetor.length - 1); i >= 0; i--) {
			mensagem += (vetor[i]) + " | ";
		}
		JOptionPane.showMessageDialog(null, mensagem);
	}

}
