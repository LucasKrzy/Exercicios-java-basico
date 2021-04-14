/**
 * 
 */
package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar a utilização de vetor do tipo double
 * @author Lucas Pedroso Krzyzanowski
 * @since 11 de fev. de 2021
 */
public class VetorDouble {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando o vetor
		double vetor [];
		
		// Iniciando o vetor e informando a quantidade de posições (tamanho)
		vetor = new double[5];

		// Valorizando o vetor com dados informados pelo usuario
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
		}
		
		// exibindo os dados gravados no vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
