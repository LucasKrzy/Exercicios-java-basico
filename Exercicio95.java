package exercicios;

//import java.util.Arrays;

import javax.swing.JOptionPane;


/**
 * Programa para ler a 10 numeros e os ordenar em ordem crescente e apresenta
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio95 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando o vetor
		double vetor[];
		double aux;
		String mensagem = "Valores no vetor: ";

		// Iniciando o vetor e informando a quantidade de posições (tamanho)
		vetor = new double[10];

		// Valorizando o vetor com dados informados pelo usuario
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o "+ (i+1)+ " valor"));
		}
		
		// ordena o vetor
		//Arrays.sort(vetor);
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				if (vetor[j] > vetor [i]) {
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
		// exibindo os dados gravados no vetor
		for (int i = 0; i < vetor.length; i++) {
			mensagem += (vetor[i]) + " | ";
		}
		JOptionPane.showMessageDialog(null, mensagem);
		
	}

}
