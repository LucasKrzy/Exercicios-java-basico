package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o sal�rio de um vendedor e total das vendas,
 * em seguida calcular e apresentar o sal�rio atual com a comiss�o de
 * 3% para vendas de at� R$ 1500 e 5% para valores que ultrapassem esse valor
 * @author Lucas Pedroso Krzyzanowski
 * @since 09/02/2021
 */
public class Exercicio45 {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// Declarando variaveis
		double salario, vendas;
		
		// Captura de dados
		JOptionPane.showMessageDialog(null, "C�lcular o sal�rio de um funcion�rio");
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio fixo do funcion�rio:"));
		vendas = Double.parseDouble(JOptionPane.showInputDialog("Informe o total de vendas realizadas:"));
		
		// calcular e exibir o sal�rio recebido
		if (vendas  > 1500) {
			JOptionPane.showMessageDialog(null,"O sal�rio recebido pelo funcion�rio �: R$ " + String.format("%.2f", (1500 * 0.03 + (vendas - 1500) * 0.05 + salario)));
		} else {
			JOptionPane.showMessageDialog(null, "O sal�rio recebido pelo funcion�rio �: R$ " + String.format("%.2f", salario + vendas * 0.03));			
		}
		
	}

}
