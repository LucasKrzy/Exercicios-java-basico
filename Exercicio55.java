package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o nome de dois times e a quantidade de gols de cada time, em seguida mostrar o time vencedor ou se a partida empatou
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio55 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		int golsT1, golsT2;
		String T1, T2;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "Cálcular o resultado de uma partida de futebol");
		T1 = JOptionPane.showInputDialog("Informe o nome do primeiro time:");
		T2 = JOptionPane.showInputDialog("Informe o nome do segundo time:");
		golsT1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de gols que o time " + T1 +" marcou:"));
		golsT2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de gols que o time " + T2 +" marcou:"));
		
		// calcular e exibir o time vencedor
		if (golsT1 > golsT2) {
			JOptionPane.showMessageDialog(null,"O time vencedor foi: " + T1);
		} else if (golsT1 < golsT2){
			JOptionPane.showMessageDialog(null,"O time vencedor foi: " + T2);
		}else {
			JOptionPane.showMessageDialog(null, "EMPATE");
		}			
		
	}

}
