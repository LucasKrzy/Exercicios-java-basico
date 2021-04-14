/**
 * 
 */
package exemplo05;

import javax.swing.JOptionPane;

/**
 * Programa para buscar um valr especifico no vetor String
 * @author Lucas Pedroso Krzyzanowski
 * @since 11 de fev. de 2021
 */
public class BuscarValorVetorString {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// Declarando o vetor
		String vetor [];
		
		// Auxiliar para buscar um registro
		String nome = "Lucas";
		
		// Iniciando o vetor e informando a quantidade de posições (tamanho)
		vetor = new String[3];

		// Valorizando o vetor com dados informados pelo usuario
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = JOptionPane.showInputDialog("Informe um nome");
		}
		
		// exibindo os dados gravados no vetor
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].equals(nome)) {
				System.out.println("Achei o que você procurava na posição" + i);
				
			}
		}
	}

}
