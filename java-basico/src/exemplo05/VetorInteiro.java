/**
 * 
 */
package exemplo05;

/**
 * Programa para demonstrar a utilização de vetor do tipo inteiro
 * @author Lucas Pedroso Krzyzanowski
 * @since 11 de fev. de 2021
 */
public class VetorInteiro {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando o vetor
		int vetor [];
		
		// Iniciando o vetor e informando a quantidade de posições (tamanho)
		vetor = new int[10];
		
		// Adicionando o valor 10 na 1ª posição do vetor no seu índice 0
		vetor[0] = 10;

		// Adicionando o valor 5 na 2ª posição do vetor no seu índice 1
		vetor[1] = 5;
		
		// Adicionando o valor 25 na 3ª posição do vetor no seu índice 2
		vetor[2] = 25;

		// Exibindo o valor do vetor na 1ª posição
		System.out.println(vetor[0]);

		// Exibindo o valor do vetor na 2ª posição
		System.out.println(vetor[1]);

		// Exibindo o valor do vetor na 3ª posição
		System.out.println(vetor[2]);
		
	}

}
