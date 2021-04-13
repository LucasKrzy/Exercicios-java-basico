package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler a 20 numeros positivos buscando o maior valor e sua posição no vetor
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio90 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double vetor[];
		int posicao;

		// inicializar e definir o tamanho do vetor
		vetor = new double[20];
		
//		inicializando a variaveis em 0
		posicao = 0;

		JOptionPane.showMessageDialog(null, "Encontrar o maior valor em um vetor");
		// recebendo do usuario valores
		for (int i = 0; i < vetor.length; i++) {
			// apenas numeros positivos devem ser aceitos
			do {
				vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i+1) + " valor:\nApenas valores inteiros serão aceitos"));
			} while (vetor[i] < 0);
			if (vetor[i] > vetor[posicao]) {
				posicao = i;
			}
		}
		
		// mostra na tela o maior valor informado e sua posição
		JOptionPane.showMessageDialog(null, "O maior valor informado é: vetor["+ posicao + "] = " + vetor[posicao]);
		
		

	}

}
