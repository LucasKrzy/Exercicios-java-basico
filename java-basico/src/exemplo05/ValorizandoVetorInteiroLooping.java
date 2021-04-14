/**
 * 
 */
package exemplo05;


import javax.swing.JOptionPane;

/**
 * Programa para demonstrar como valorizar um vetor do tipo inteiro utilizando
 * looping (for)
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 11 de fev. de 2021
 */
public class ValorizandoVetorInteiroLooping {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando o vetor
		int vetor[];

		// Iniciando o vetor e informando a quantidade de posições (tamanho)
		vetor = new int[5];

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
