package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um vetor com 10 numeros e  uma variavel para contar a quantidade de vezes que o valor da variavel aparece no vetor
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio99 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando o vetor
		double V1[], aux;
		int cont;

	
		// Iniciando o vetor e informando a quantidade de posições (tamanho)
		V1 = new double[10];
		
		// iniciando o vetor contador
		cont = 0;
		
		JOptionPane.showMessageDialog(null, "Programa para realizar busca");
		
		// Valorizando os vetores com dados informados pelo usuario
		for (int i = 0; i < V1.length; i++) {
			V1[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o "+ (i+1) + " valor do vetor:"));
		}

		// recebendo valor para buscar e contar quantas vezes aparece no vetor
		aux = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor para contar quantas vezes ele aparece no vetor:"));
			

		// contando quantas vezes o valor da variavel aparece no vetor
		for (int i = 0; i < V1.length; i++) {
			if (V1[i] == aux) {
				cont++;
			}
		}
		
		// mostrando quantas vezes o valor aparece
		JOptionPane.showMessageDialog(null,"O valor "+ aux + " aparece "+ cont + " vezes no vetor. ");
	}

}
