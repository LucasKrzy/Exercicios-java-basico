package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o horário de inicio e o horário final de um jogo de xadres e calcular sua duração
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio43 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		int inicio, fim;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "Cálcular a duração de uma partida de xadrez");
		inicio = Integer.parseInt(JOptionPane.showInputDialog("Informe o horário de inicio do jogo:"));
		fim = Integer.parseInt(JOptionPane.showInputDialog("Informe o horário do fim do jogo:"));
		
		// Exibir a duração da partida
		if (inicio >= fim) {
			JOptionPane.showMessageDialog(null,"O jogo teve uma duração de: " + (fim - inicio + 24) + " horas.");
		} else {
			JOptionPane.showMessageDialog(null, "O jogo teve uma duração de: " + (fim - inicio) + " horas.");			
		}
		
	}

}
