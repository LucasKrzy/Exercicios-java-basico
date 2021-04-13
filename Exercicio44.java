package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o n�mero de horas trabalhadas por um funcion�rio, seu sal�rio por hora e informar o sal�rio total do funcion�rio
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio44 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double horas, salarioHora;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "C�lcular o sal�rio de um funcion�rio");
		horas = Double.parseDouble(JOptionPane.showInputDialog("Informe o total de horas trabalhadas:"));
		salarioHora = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio recebido por hora:"));
		
		// calcular e exibir o sal�rio total do funcion�rio
		if (horas  > 40) {
			JOptionPane.showMessageDialog(null,"O sal�rio recebido pelo funcion�rio �: R$ " + String.format("%.2f", (40 * salarioHora + (horas - 40) * (salarioHora * 1.5))));
		} else {
			JOptionPane.showMessageDialog(null, "O sal�rio recebido pelo funcion�rio �: R$ " + String.format("%.2f", horas * salarioHora));			
		}
		
	}

}
