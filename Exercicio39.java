package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler duas notas de um aluno e calcular a média do mesmo, em seguida apresentar se o aluno foi aprovado ou reprovado
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio39 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double n1, n2, media;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "Verificação se um aluno foi Aprovado ou Reprovado");
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1:"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2:"));

		// Calculando media
		media = (n1 + n2) / 2;
		
		// Exibir o médoa di aluno e se foi aprovado ou reprovado
		JOptionPane.showMessageDialog(null, "A média do aluno é: "+ media);
		
		if (media >= 6) {
			JOptionPane.showMessageDialog(null, "O aluno foi aprovado");
		} else {
			JOptionPane.showMessageDialog(null, "O aluno foi reprovado");			
		}
		
	}

}
