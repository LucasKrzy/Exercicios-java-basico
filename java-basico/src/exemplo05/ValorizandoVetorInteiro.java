/**
 * 
 */
package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar como valorizar um vetor do tipo inteiro
 * @author Lucas Pedroso Krzyzanowski
 * @since 11 de fev. de 2021
 */
public class ValorizandoVetorInteiro {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando o vetor
		int vetor [];
		
		// Iniciando o vetor e informando a quantidade de posi��es (tamanho)
		vetor = new int[5];
		
		// recebendo valores do usu�rio
		vetor[0] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		vetor[1] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		vetor[2] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		vetor[3] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		vetor[4] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		
		// exibindo os dados do vetor
		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2]);
		System.out.println(vetor[3]);
		System.out.println(vetor[4]);
	}

}
