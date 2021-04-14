/**
 * 
 */
package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar a utilização de vetor do tipo String
 * @author Lucas Pedroso Krzyzanowski
 * @since 11 de fev. de 2021
 */
public class VetorString {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando o vetor
		String vetor [];
		
		// Iniciando o vetor e informando a quantidade de posições (tamanho)
		vetor = new String[5];

		// Valorizando o vetor com dados informados pelo usuario
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = JOptionPane.showInputDialog("Informe um nome");
		}
		
		// exibindo os dados gravados no vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
