package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o número de horas trabalhadas por um funcionário, seu salário por hora e informar o salário total do funcionário
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio44 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double horas, salarioHora;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "Cálcular o salário de um funcionário");
		horas = Double.parseDouble(JOptionPane.showInputDialog("Informe o total de horas trabalhadas:"));
		salarioHora = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário recebido por hora:"));
		
		// calcular e exibir o salário total do funcionário
		if (horas  > 40) {
			JOptionPane.showMessageDialog(null,"O salário recebido pelo funcionário é: R$ " + String.format("%.2f", (40 * salarioHora + (horas - 40) * (salarioHora * 1.5))));
		} else {
			JOptionPane.showMessageDialog(null, "O salário recebido pelo funcionário é: R$ " + String.format("%.2f", horas * salarioHora));			
		}
		
	}

}
