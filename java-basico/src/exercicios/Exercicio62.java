package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler tr�s notas de um aluno e a m�dia dos exercicios, calcular a
 * m�dia do mesmo, em seguida apresentar o conceito do aluno
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio62 {
	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double n1, n2, n3, atividades, media;

		// Captura de dados
		JOptionPane.showMessageDialog(null, "C�lculo do conceito de um aluno");
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1:"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2:"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 3:"));
		atividades = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da m�dia das atividades:"));

		// calcula m�dia
		media = (n1 + n2 * 2 + n3 * 3 + atividades) / 7;

		// apresenta a m�dia do aluno
		JOptionPane.showMessageDialog(null, "A m�dia do aluno �: " + media);

		// apresenta o conceito do aluno
		if (media >= 9) {
			JOptionPane.showMessageDialog(null, "Aluno conceito A");
		} else if (media >= 7.5) {
			JOptionPane.showMessageDialog(null, "Aluno conceito B");
		} else if (media >= 6) {
			JOptionPane.showMessageDialog(null, "Aluno conceito C");
		} else {
			JOptionPane.showMessageDialog(null, "Aluno conceito D");
		}

	}

}
