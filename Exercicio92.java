package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler a 10 numeros e multiplicar esses numeros por um valor
 * informado pelo usuario, armazenando o resultado da multiplicação em um vetor
 * e o apresentando
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio92 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double A[], M[], x;

		// inicializar e definir o tamanho do vetor
		A = new double[10];
		M = new double[10];

		// recebendo do usuario valores
		for (int i = 0; i < A.length; i++) {
			A[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i + 1) + " valor:"));
		}
		
		x = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor para multipliar pelos valores do vetor:"));
		
		for (int i = 0; i < M.length; i++) {
			M[i] = A[i] * x;
		}
		
		for (int i = 0; i < M.length; i++) {
			System.out.println(M[i]);
		}
	}

}
