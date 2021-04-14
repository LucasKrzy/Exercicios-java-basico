package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o salário de um vendedor e total das vendas,
 * em seguida calcular e apresentar o salário atual com a comissão de
 * 3% para vendas de até R$ 1500 e 5% para valores que ultrapassem esse valor
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio45 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double salario, vendas;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "Cálcular o salário de um funcionário");
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário fixo do funcionário:"));
		vendas = Double.parseDouble(JOptionPane.showInputDialog("Informe o total de vendas realizadas:"));
		
		// calcular e exibir o salário recebido
		if (vendas  > 1500) {
			JOptionPane.showMessageDialog(null,"O salário recebido pelo funcionário é: R$ " + String.format("%.2f", (1500 * 0.03 + (vendas - 1500) * 0.05 + salario)));
		} else {
			JOptionPane.showMessageDialog(null, "O salário recebido pelo funcionário é: R$ " + String.format("%.2f", salario + vendas * 0.03));			
		}
		
	}

}
