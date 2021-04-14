/**
 * 
 */
package exemplo05;


import javax.swing.JOptionPane;

/**
 * Programa para demonstrar como realizar a soma dos dados de um vetor do tipo inteiro  
 * @author Lucas Pedroso Krzyzanowski
 * @since 11 de fev. de 2021
 */
public class SomaVetor {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando o vetor
		int vetor[];
		// Declarando variavel para receber resultado da soma
		int soma;

		// Iniciando o vetor e informando a quantidade de posições (tamanho)
		vetor = new int[5];
		
		// Iniciando os dados do vetor em zero
		soma = 0;

		// recebendo valores do usuário com auxilio do comando for
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		}

		// realizando a soma dos dados do vetor
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		System.out.println(soma);
	}

}
