package exercicios;


//import java.util.Arrays;

import javax.swing.JOptionPane;


/**
 * Programa para ler a 20 numeros e em seguida ler um número o buscando no vetor e o apagando 
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio97 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando o vetor
		double vetor[];
		double vetor2[];
		double aux;
		boolean encontrou = false;
		String mensagem = "Valores no vetor: ";

		// Iniciando o vetor e informando a quantidade de posições (tamanho)
		vetor = new double[20];
		vetor2 = new double[19];
		
		JOptionPane.showMessageDialog(null, "Buscar e apagar um valor de um vetor");

		// Valorizando o vetor com dados informados pelo usuario
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o "+ (i+1) +" valor"));
		}
		
		
		// recebendo valor para buscar e apagar do vetor
		aux = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor para apagar o mesmo do vetor"));
		
		//inserindo novo valor no vetor
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == aux) {
				encontrou = true;
				for (int j = 0; j < vetor2.length; j++) {
					if (i == j) {
						for (int j2 = i; j2 < vetor2.length; j2++) {
							vetor2[j2] = vetor [j2+1];
						}
						i = vetor.length;
						j = vetor2.length;
					} else {
						vetor2[j] = vetor [j];
					}
				}
			}
			
		}
		

		// exibindo os dados gravados no vetor
		if (encontrou) {
			for (int i = 0; i < vetor2.length ; i++) {
				mensagem += (vetor2[i]) + " | ";
			}
		} else {
			for (int i = 0; i < vetor.length ; i++) {
				mensagem += (vetor[i]) + " | ";
			}
		}
		
		JOptionPane.showMessageDialog(null, mensagem);
	}

}
