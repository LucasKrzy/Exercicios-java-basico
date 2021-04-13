package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler dois vetores de tamanho N e apresentar em um terceiro vetor o resultado da soma dos conteudos dos vetores respeitando as posições
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio94 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando o vetor
		double A[], B[], SOMA[];
		String mensagem = "Soma dos vetores A + B:\n ";

		// variavel para definir o tamanho dso vetores
		int N;
		N = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho dos vetores"));

		// Iniciando o vetor e informando a quantidade de posições (tamanho)
		A = new double[N];
		B = new double[N];
		SOMA = new double[N];

		// Valorizando os vetores com dados informados pelo usuario
		for (int i = 0; i < A.length; i++) {
			A[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o "+ (i+1) + " valor do vetor A:"));
		}

		for (int i = 0; i < B.length; i++) {
			B[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o "+ (i+1) + " valor do vetor B:"));
		}

		// Valorizando o vetor SOMA com o resultado da soma dos vetores A e B e mostrando o resultado da soma
		for (int i = 0; i < SOMA.length; i++) {
			SOMA[i] =A[i] + B[i];
			mensagem += (A[i] + " + " + B[i] + " = " + SOMA[i]) + "\n";
		}
		JOptionPane.showMessageDialog(null, mensagem);
	}

}
