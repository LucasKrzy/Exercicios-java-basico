package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler a nota de 20 alunos calculando a m�dia da turma e quantos alunos tiraram nota acima da m�dia calculada
 * 
 * @author Lucas Pedroso Krzyzanowski
 * @since 10/02/2021
 */
public class Exercicio89 {
	/*
	 * M�todo principal para executar a classe
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

		JOptionPane.showMessageDialog(null, "Ler as notas de uma turma e contar\n o n�mero de alunos acima da m�diar");
		// recebendo do usuario a nota dos alunos e calculando a m�dia da turma
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do " + (i+1) + " aluno:"));
			media += vetor[i];
		}
		// calcula a m�dia dos alunos
		if (media != 0) {
			media /= 20;
		}
		
		// calcula numero de alunos acima da m�dia
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > media) {
				cont++;
			}
		}
		
		// mostra na tela a m�dia dos alunos e n�mero de alunos acima da m�dia
		JOptionPane.showMessageDialog(null, "A m�dia da turma �: "+ media + "\nA turma possui " + cont + " alunos com nota acima da m�dia");
		
		

	}

}
