/**
 * 
 */
package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar vetor com o usuário informando o seu tamanho
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 11 de fev. de 2021
 */
public class VetorTamanhoDinamico {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando o vetor
		int vetor[];

		// variavel para definir o tamanho do vetor
		int tamanho;
		tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor"));

		// Iniciando o vetor com tamanho informado pelo usuario
		vetor = new int[tamanho];

		// recebendo valores do usuário com auxilio do comando for
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		}

		// exibindo os dados do vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
