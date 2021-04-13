package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler nomes e armazenar em um vettor e em seguida solicitar um
 * nome para buscar no vetor, apresentando se o vetor contem o nome buscado
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio88 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando um vetor String
		String nomes[];

		// inicializar e definir o tamanho do vetor
		nomes = new String[10];
		
		JOptionPane.showMessageDialog(null,"Armazenar nomes em um vetor e em seguida\nler um nome e buscar o mesmo no vetor");

		// recebendo do usuario os nomes e armazenando em um vetor
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog("Informe o " + (i + 1) + " nome:");
		}

		// recebendo do usuario um nome qualquer
		String busca = JOptionPane.showInputDialog("Informe o nome a ser procurado:");


		// varrendo o vetor para verificar se o nome informado pelo usuario existe
		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i].equals(busca)) {
				JOptionPane.showMessageDialog(null,"ACHEI");
				break;
			} else if (i == nomes.length - 1) {
				JOptionPane.showMessageDialog(null,"NÃO ACHEI");
			}
		}

	}

}
