package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler a nota de 20 alunos calculando a média da turma e quantos alunos tiraram nota acima da média calculada
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio89 {
	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double media, vetor[];
		int cont;

		// inicializar e definir o tamanho do vetor
		vetor = new double[20];
		
//		inicializando a variaveis em 0
		media = 0;
		cont = 0;

		JOptionPane.showMessageDialog(null, "Ler as notas de uma turma e contar\n o número de alunos acima da médiar");
		// recebendo do usuario a nota dos alunos e calculando a média da turma
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do " + (i+1) + " aluno:"));
			media += vetor[i];
		}
		// calcula a média dos alunos
		if (media != 0) {
			media /= 20;
		}
		
		// calcula numero de alunos acima da média
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > media) {
				cont++;
			}
		}
		
		// mostra na tela a média dos alunos e número de alunos acima da média
		JOptionPane.showMessageDialog(null, "A média da turma é: "+ media + "\nA turma possui " + cont + " alunos com nota acima da média");
		
		

	}

}
