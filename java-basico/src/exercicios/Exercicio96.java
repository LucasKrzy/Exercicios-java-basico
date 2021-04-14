package exercicios;

//import java.util.Arrays;

import javax.swing.JOptionPane;


/**
 * Programa para ler a 10 numeros e os ordenar em ordem crescente em seguida receber um novo valor e inserir o mesmo na posição correta
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio96 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando o vetor
		double vetor[];
		double aux;
		int aux2;
		String mensagem = "Valores no vetor: ";

		// Iniciando o vetor e informando a quantidade de posições (tamanho)
		vetor = new double[11];

		// Valorizando o vetor com dados informados pelo usuario
		for (int i = 0; i < 10; i++) {
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i+1) +" valor"));
		}
		
		// ordena o vetor
		//Arrays.sort(vetor);
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (vetor[j] > vetor [i]) {
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
		
		// recebendo valor para inserir no vetor
		vetor[10] = Double.parseDouble(JOptionPane.showInputDialog("Informe um novo valor para adicionar no vetor"));
		
		//inserindo novo valor no vetor
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > vetor[10]) {
				aux2 = i;
				i = 10;
				for (int j = aux2; j < vetor.length; j++) {
					aux = vetor [j];
					vetor[j] = vetor[i];
					vetor[i] = aux;
				}
			}
			
		}
		

		// exibindo os dados gravados no vetor
		for (int i = 0; i < vetor.length; i++) {
			mensagem +=(vetor[i]) + " | ";
		}
		JOptionPane.showMessageDialog(null, mensagem);
		
		
	}

}
