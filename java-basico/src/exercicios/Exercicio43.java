package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o hor�rio de inicio e o hor�rio final de um jogo de xadres e calcular sua dura��o
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio43 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		int inicio, fim;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "C�lcular a dura��o de uma partida de xadrez");
		inicio = Integer.parseInt(JOptionPane.showInputDialog("Informe o hor�rio de inicio do jogo:"));
		fim = Integer.parseInt(JOptionPane.showInputDialog("Informe o hor�rio do fim do jogo:"));
		
		// Exibir a dura��o da partida
		if (inicio >= fim) {
			JOptionPane.showMessageDialog(null,"O jogo teve uma dura��o de: " + (fim - inicio + 24) + " horas.");
		} else {
			JOptionPane.showMessageDialog(null, "O jogo teve uma dura��o de: " + (fim - inicio) + " horas.");			
		}
		
	}

}
